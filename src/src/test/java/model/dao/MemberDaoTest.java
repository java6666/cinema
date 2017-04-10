package model.dao;

import model.entity.Member;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/4/10.
 */
public class MemberDaoTest {
    private MemberDao memberDao;
    @Before
    public void setUp(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        MemberDao bean = context.getBean(MemberDao.class);
        this.memberDao=bean;
    }
    @Test
    public void selectMemberByName(){
        Member member = memberDao.selectMemberByName("123");
        System.out.println(member.getMemberName());
    }
}
