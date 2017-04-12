package model.entity;

/**
 * Created by lenovo on 2017/4/7.
 */
public class Member {
    private Integer memberId;
    private String memberEmail;
    private String memberPwd;
    private String memberName;
    private String memberPhone;
    private Double memberMoney;
    private Integer memberGender;
    private String memberPhoto;

    public Member() {
    }

    public Member(Integer memberId, String memberPwd, String memberName) {
        this.memberId = memberId;
        this.memberPwd = memberPwd;
        this.memberName = memberName;
    }

    public Member(Integer memberId, String memberEmail, String memberName, String memberPhone, Integer memberGender, String memberPhoto) {
        this.memberId = memberId;
        this.memberEmail = memberEmail;
        this.memberName = memberName;
        this.memberPhone = memberPhone;
        this.memberGender = memberGender;
        this.memberPhoto = memberPhoto;
    }

    public Member(String memberEmail, String memberPwd, String memberName, String memberPhone, Integer memberGender, String memberPhoto) {
        this.memberEmail = memberEmail;
        this.memberPwd = memberPwd;
        this.memberName = memberName;
        this.memberPhone = memberPhone;
        this.memberGender = memberGender;
        this.memberPhoto = memberPhoto;
    }

    public Member(String memberEmail, String memberPwd, String memberName, String memberPhone, Double memberMoney, Integer memberGender, String memberPhoto) {
        this.memberEmail = memberEmail;
        this.memberPwd = memberPwd;
        this.memberName = memberName;
        this.memberPhone = memberPhone;
        this.memberMoney = memberMoney;
        this.memberGender = memberGender;
        this.memberPhoto = memberPhoto;
    }

    public Member(Integer memberId, String memberEmail, String memberPwd, String memberName, String memberPhone, Double memberMoney, Integer memberGender, String memberPhoto) {
        this.memberId = memberId;
        this.memberEmail = memberEmail;
        this.memberPwd = memberPwd;
        this.memberName = memberName;
        this.memberPhone = memberPhone;
        this.memberMoney = memberMoney;
        this.memberGender = memberGender;
        this.memberPhoto = memberPhoto;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPwd() {
        return memberPwd;
    }

    public void setMemberPwd(String memberPwd) {
        this.memberPwd = memberPwd;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public Double getMemberMoney() {
        return memberMoney;
    }

    public void setMemberMoney(Double memberMoney) {
        this.memberMoney = memberMoney;
    }

    public Integer getMemberGender() {
        return memberGender;
    }

    public void setMemberGender(Integer memberGender) {
        this.memberGender = memberGender;
    }

    public String getMemberPhoto() {
        return memberPhoto;
    }

    public void setMemberPhoto(String memberPhoto) {
        this.memberPhoto = memberPhoto;
    }
}
