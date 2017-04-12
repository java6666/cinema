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
 * Created by lenovo on 2017/4/12.
 */
@Controller
public class GuestController {

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
}
