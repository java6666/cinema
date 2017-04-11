package model.dao;

import model.entity.Member;

import java.util.List;

/**
 * Created by lenovo on 2017/4/9.
 */
public interface MemberDao {
    void insertMember(Member member);
    void deleteMemberById(Integer id);
    void updateMemberById(Member member);
    List<Member> selectMember();
    Member selectMemberByName(String name);
    Member selectMemberById(Integer id);
}
