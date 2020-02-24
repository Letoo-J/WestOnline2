package com.mine.bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//作业提交列表类：
public class Assignmentlist {
    private Integer subId;    //提交id
    private String sid;       //学号
    private String sname;     //学生姓名
    private Date subDate;     //提交时间
    private String idenCode;  //考核标识码
    private String document;  //文件（路径）
    private String review = "审核中";    //评审状态


	public Assignmentlist(Integer subId, String sid, String sname, Date subDate, String idenCode, String document) {
        this.subId = subId;
		this.sid = sid;
        this.sname = sname;
        this.subDate = subDate;
        this.idenCode = idenCode;
        this.document = document;
    }
	
	public Assignmentlist(String sid, String sname, Date subDate, String idenCode, String document) {
        this.sid = sid;
        this.sname = sname;
        this.subDate = subDate;
        this.idenCode = idenCode;
        this.document = document;
    }
	
	public String getreview() {
		return review;
	}

	public void setreview(String review) {
		this.review = review;
	}
	
	public Assignmentlist(String sid, Date subDate, String idenCode) {
        this.sid = sid;
        this.subDate = subDate;
        this.idenCode = idenCode;
    }

    public Assignmentlist() {
        super();
    }

    public Integer getSubId() {
        return subId;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Date getsubDate() {
        return subDate;
    }

    public void setsubDate(Date subDate) {
        this.subDate = subDate;
    }

    public String getidenCode() {
        return idenCode;
    }

    public void setidenCode(String idenCode) {
        this.idenCode = idenCode == null ? null : idenCode.trim();
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document == null ? null : document.trim();
    }
    
    public String DateToString(Date date) {
    	//以下填写的是想要进行转换的时间格式
    	DateFormat format = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");    
		String date_str = format.format(date);
		//System.out.println(date_str);
		return date_str;
    }
    
    @Override
	public String toString() {
		return "Assignmentlist [ sub_id="+subId + ", sid=" + sid + ", sname=" + sname + ", subDate=" + subDate
				+ ", idenCode=" + idenCode + "]";
	}

}