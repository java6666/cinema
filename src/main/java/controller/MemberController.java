package controller;

import model.dao.MemberDao;
import model.entity.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by lenovo on 2017/4/9.
 */
@Controller
public class MemberController {
    @Resource
    private MemberDao memberDao;

    @RequestMapping(path = "/addMember",method = RequestMethod.GET)
    public String addMember(){
        return "WEB-INF/addMember.jsp";
    }

    @RequestMapping(path = "/addMember",method = RequestMethod.POST)
    public String addMember(String email, String password, String name, String photo, Integer gender, String phone, Model model){
        Member member = new Member(email, password, name, phone, gender, phone);
        Member temp = memberDao.selectMemberByName(name);
        if(temp!=null){
            model.addAttribute("temp","用户名重复");
            return "WEB-INF/addMember.jsp";
        }else {
            memberDao.insertMember(member);

            return "index.jsp";
        }
    }
    @RequestMapping(path = "/login",method = RequestMethod.GET)
    public String login(){
        return "WEB-INF/login.jsp";
    }
    @RequestMapping(path ="/login",method = RequestMethod.POST)
    public String login(String name, String password, Model model, HttpSession session){
        String str=null;
        Member member = memberDao.selectMemberByName(name);
        if(member == null){
            model.addAttribute("temp","用户名或密码不正确");
            str="WEB-INF/login.jsp";
        }else if (password.equals(member.getMemberPwd())){
            Member memberS = new Member(member.getMemberId(), member.getMemberName(), member.getMemberPwd());
            session.setAttribute("session",memberS);
            str="WEB-INF/good.jsp";
        }else {
            model.addAttribute("temp","用户名或密码不正确");
            str="WEB-INF/login.jsp";
        }
        return str;
    }
    @RequestMapping(value = "/selectMember",method = RequestMethod.GET)
    public String selectMember(Model model,HttpSession session){
        Member memberS = (Member) session.getAttribute("session");
        Member member = memberDao.selectMemberById(memberS.getMemberId());
        model.addAttribute("temp",member);
        return "WEB-INF/selectMember.jsp";
    }
    @RequestMapping(value = "/updateMember",method = RequestMethod.GET)
    public String updateMember(HttpSession session,Model model){
        Member memberS = (Member) session.getAttribute("session");
        Member member = memberDao.selectMemberById(memberS.getMemberId());
        model.addAttribute("temp",member);
        return "WEB-INF/updateMember.jsp";
    }
    @RequestMapping(value = "/updateMember",method = RequestMethod.POST)
    public String updateMember(HttpSession session,Integer id,String email,String name,String phone,Integer gender,String photo){
        Member memberS = (Member) session.getAttribute("session");
        Member member = memberDao.selectMemberById(memberS.getMemberId());
        member.setMemberEmail(email);
        member.setMemberName(name);
        member.setMemberPhone(phone);
        member.setMemberGender(gender);
        member.setMemberPhoto(photo);
        String str = id.toString();
        memberDao.updateMemberById(member);
        return "redirect:/selectMember";
    }
    @RequestMapping(value = "/updatePwd",method = RequestMethod.GET)
    public String updatePwd(){
        return "WEB-INF/updatePwd.jsp";
    }
    @RequestMapping(value = "/updatePwd",method = RequestMethod.POST)
    public String updatePwd(String password,String passwordO,HttpSession session,Model model){
        String str ="";
        Member memberS = (Member) session.getAttribute("session");
        Member member = memberDao.selectMemberById(memberS.getMemberId());
        if(passwordO.equals(member.getMemberPwd())){
            member.setMemberPwd(password);
            memberDao.updateMemberById(member);
            str="redirect:/selectMember";
        }else {
            model.addAttribute("temp","与原密码不符");
            str="WEB-INF/updatePwd.jsp";
        }
        return str;

    }



}
