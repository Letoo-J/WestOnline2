package com.mine.bean;

//管理员类：
public class Admin {
    private Integer aId;      //管理员id
    private String adminName; //管理员姓名
    private String password;  //管理员密码
    
    public Admin() {
        super();
    }

	public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getadminName() {
        return adminName;
    }

    public void setadminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
    
    
    public Admin(String adminName, String password) {
        this.adminName = adminName;
        this.password = password;
    }
    

    @Override
	public String toString() {
		return "Admin [adminName=" + adminName + "]";
	}

}