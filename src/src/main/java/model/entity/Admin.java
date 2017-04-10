package model.entity;

/**
 * Created by lenovo on 2017/4/7.
 */
public class Admin {
    private int adminId;
    private String adminName;
    private String adminPwd;
    private String adminPrivilege;

    public Admin() {
    }

    public Admin(String adminName, String adminPwd, String adminPrivilege) {
        this.adminName = adminName;
        this.adminPwd = adminPwd;
        this.adminPrivilege = adminPrivilege;
    }

    public Admin(int adminId, String adminName, String adminPwd, String adminPrivilege) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPwd = adminPwd;
        this.adminPrivilege = adminPrivilege;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }

    public String getAdminPrivilege() {
        return adminPrivilege;
    }

    public void setAdminPrivilege(String adminPrivilege) {
        this.adminPrivilege = adminPrivilege;
    }
}
