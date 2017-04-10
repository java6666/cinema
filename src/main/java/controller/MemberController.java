package controller;

import model.dao.MemberDao;
import model.entity.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

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
    public String login(String name,String password,Model model){
        String str=null;
        Member member = memberDao.selectMemberByName(name);
        if(member == null){
            model.addAttribute("temp","用户名或密码不正确");
            str="WEB-INF/login.jsp";
        }else if (password.equals(member.getMemberPwd())){
            str="WEB-INF/good.jsp";
        }

        return str;


    }
    //查询所有用户信息
    @RequestMapping(value="/selectMember",method=RequestMethod.GET,produces = "text/html;charset=utf-8")
    public  String selectMember(HttpServletRequest request){
        List<Member> membersList = memberDao.selectMember();
        request.setAttribute("membersList",membersList);
        return "WEB-INF/admin/allMember.jsp";
    }
    //更新用户信息
    @RequestMapping(value="/updateMember",method=RequestMethod.GET,produces = "text/html;charset=utf-8")
    public  String updateMember(Integer memberId,String memberName ,HttpServletRequest request){
        Member member = new Member();
        member= memberDao.selectMemberByName(memberName);
        request.setAttribute("memberId",memberId);
        request.setAttribute("member",member);
        return "WEB-INF/admin/updateMember.jsp";
    }

    @RequestMapping(value="/updateMember",method=RequestMethod.POST,produces = "text/html;charset=utf-8")
    public String updateMember(Integer memberId ,String memberEmail, String memberPwd, String memberName, String memberPhone,Double memberMoney,Integer memberGender ,String memberPhoto ,HttpServletRequest request){
        Member member = new Member();
        member.setMemberId(memberId);
        member.setMemberEmail(memberEmail);
        member.setMemberName(memberName);
        member.setMemberPwd(memberPwd);
        member.setMemberPhone(memberPhone);
        member.setMemberMoney(memberMoney);
        member.setMemberGender(1);
        member.setMemberPhoto(memberPhoto);

        memberDao.updateMemberById(member);

        return "redirect:/selectMember";
    }

    @RequestMapping(value="/deleteMember",method=RequestMethod.GET,produces = "text/html;charset=utf-8")
    public  String updateMember(Integer memberId,HttpServletRequest request){

         memberDao.deleteMemberById(memberId);

        return "redirect:/selectMember";
    }

}
