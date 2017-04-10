package model.dao;

import model.entity.Admin;

import java.util.List;

/**
 * Created by lenovo on 2017/4/8.
 */
public interface AdminDao {
    void insertAdmin(Admin admin);
    void updateAdminById(Admin admin);
    List<Admin> selectAdmin();
    void deleteAdminById(Integer id);

}
