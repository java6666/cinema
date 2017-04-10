package controller;

import model.dao.MemberDao;
import model.entity.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2017/4/9.
 */
@Controller
public class MemberController {
    @Resource
    private MemberDao memberDao;

    @RequestMapping(path = "/addMember",method = RequestMethod.GET,produces = "text/html;charset=utf-8")
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
    @RequestMapping(path = "/login",method = RequestMethod.GET,produces = "text/html;charset=utf-8")
    public String login(){
        return "WEB-INF/login.jsp";
    }
    @RequestMapping(path ="/login",method = RequestMethod.POST,produces = "text/html;charset=utf-8")
    public String login(String name,String password){
        Member member = memberDao.selectMemberByName(name);
        if (password.equals(member.getMemberPwd())){
            return "WEB-INF/good.jsp";
        }else {
            return "WEB-INF/login.jsp";
        }

    }
}
