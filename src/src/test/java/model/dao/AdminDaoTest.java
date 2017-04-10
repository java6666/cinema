package model.dao;

import model.entity.Admin;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by lenovo on 2017/4/9.
 */

public class AdminDaoTest {
    private AdminDao adminDao;
    @Before
    public void setUp(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        AdminDao bean = context.getBean(AdminDao.class);
        this.adminDao=bean;
    }
    @Test
    public void insertAdmin(){
        Admin admin = new Admin("aa", "bb", "super");
        adminDao.insertAdmin(admin);
    }
    @Test
    public void updateAdmin(){
        Admin admin = new Admin(1,"bb", "aa", "gg");
        adminDao.updateAdminById(admin);
    }
    @Test
    public void selectAdmin(){
        List<Admin> admins = adminDao.selectAdmin();
        System.out.println(admins.get(0).getAdminPrivilege());
    }
    @Test
    public void deleteAdminById(){
        adminDao.deleteAdminById(1);
    }

}
