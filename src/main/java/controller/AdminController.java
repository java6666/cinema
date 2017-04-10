package controller;

import model.dao.AdminDao;
import model.entity.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by lenovo on 2017/4/10.
 */
@Controller
public class AdminController {
    @Resource
    private AdminDao adminDao;
    @RequestMapping(value = "/admin/login",method = RequestMethod.GET)
    public String adminLogin(){
        return "/WEB-INF/admin/login.jsp";
    }
    @RequestMapping(value ="/admin/login",method = RequestMethod.POST)
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

}
