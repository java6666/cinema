package controller;

import model.dao.AdminDao;
import model.dao.MemberDao;
import model.entity.Admin;
import model.entity.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2017/4/10.
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    @Resource
    private AdminDao adminDao;
    @Resource
    private MemberDao memberDao;
    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String adminLogin(){
        return "/WEB-INF/admin/login.jsp";
    }
    @RequestMapping(value ="login",method = RequestMethod.POST)
    public String adminLogin(String name, String password, Model model){
        String str=null;
        Admin admin = adminDao.selectAdminByName(name);
        if (admin==null){
            model.addAttribute("temp","用户名密码错误");
            str="/WEB-INF/admin/login.jsp";
        }else if (password.equals(admin.getAdminPwd())){
            str="/WEB-INF/admin/good.jsp";
        }
        return str;
    }
    @RequestMapping(value = "selectAllMember",method = RequestMethod.GET)
    public String selectAllMember (Model model){
        List<Member> members = memberDao.selectMember();
        model.addAttribute("list",members);
        return "/WEB-INF/admin/allMemberList.jsp";
    }
    @RequestMapping(value = "updateMember",method = RequestMethod.GET)
    public String updateMember(Integer memberId,Model model){
        Member member = memberDao.selectMemberById(memberId);
        model.addAttribute("temp",member);
        return "/WEB-INF/admin/updateMember.jsp";

    }
    @RequestMapping(value = "updateMember",method = RequestMethod.POST)
    public String updateMember(Integer id,String email,String password,String name,String phone,Double money,Integer gender,String photo){
        Member member = new Member(id,email, password, name, phone, money, gender, photo);
        memberDao.updateMemberById(member);
        return "redirect:selectAllMember";
    }
    @RequestMapping(value = "deleteMember",method = RequestMethod.GET)
    public String deleteMember(Integer memberId){
        memberDao.deleteMemberById(memberId);
        return "redirect:selectAllMember";
    }

}
