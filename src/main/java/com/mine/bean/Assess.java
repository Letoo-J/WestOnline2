package com.mine.bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//考核类：
public class Assess {
    private Integer assesId;  //考核id
    private String name;      //名称
    private String content = "暂无";   //考核内容/说明
    private Date showDate;    //发布时间
    private String idenCode;  //标识码
    private Date deadline;    //截止时间

    
    

	public Assess(String name, String content, Date showDate, String idenCode, Date deadline) {
        this.name = name;
        this.content = content;
        this.showDate = showDate;
        this.idenCode = idenCode;
        this.deadline = deadline;
    }

    public Assess() {
        super();
    }

    public Integer getAssesId() {
        return assesId;
    }

    public void setAssesId(Integer assesId) {
        this.assesId = assesId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getshowDate() {
        return showDate;
    }

    public void setshowDate(Date showDate) {
        this.showDate = showDate;
    }

    public String getidenCode() {
        return idenCode;
    }

    public void setidenCode(String idenCode) {
        this.idenCode = idenCode == null ? null : idenCode.trim();
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
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
		return "Assess [name=" + name + ", showDate=" + showDate + ", idenCode=" + idenCode
				+ "]";
	}

}