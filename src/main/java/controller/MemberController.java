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
@RequestMapping(value = "/user")
@Controller
public class MemberController {
    @Resource
    private MemberDao memberDao;
    @RequestMapping(value = "selectMember",method = RequestMethod.GET)
    public String selectMember(Model model,HttpSession session){
        Member memberS = (Member) session.getAttribute("session");
        Member member = memberDao.selectMemberById(memberS.getMemberId());
        model.addAttribute("temp",member);
        return "/WEB-INF/user/selectMember.jsp";
    }
    @RequestMapping(value = "updateMember",method = RequestMethod.GET)
    public String updateMember(HttpSession session,Model model){
        Member memberS = (Member) session.getAttribute("session");
        Member member = memberDao.selectMemberById(memberS.getMemberId());
        model.addAttribute("temp",member);
        return "/WEB-INF/user/updateMember.jsp";
    }
    @RequestMapping(value = "updateMember",method = RequestMethod.POST)
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
        return "redirect:selectMember";
    }
    @RequestMapping(value = "updatePwd",method = RequestMethod.GET)
    public String updatePwd(){
        return "/WEB-INF/user/updatePwd.jsp";
    }
    @RequestMapping(value = "updatePwd",method = RequestMethod.POST)
    public String updatePwd(String password,String passwordO,HttpSession session,Model model){
        String str ="";
        Member memberS = (Member) session.getAttribute("session");
        Member member = memberDao.selectMemberById(memberS.getMemberId());
        if(passwordO.equals(member.getMemberPwd())){
            member.setMemberPwd(password);
            memberDao.updateMemberById(member);
            str="redirect:selectMember";
        }else {
            model.addAttribute("temp","与原密码不符");
            str="/WEB-INF/user/updatePwd.jsp";
        }
        return str;

    }



}
