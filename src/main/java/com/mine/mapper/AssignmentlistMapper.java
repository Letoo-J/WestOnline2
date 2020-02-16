package com.mine.mapper;

import com.mine.bean.Assignmentlist;
import com.mine.bean.AssignmentlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssignmentlistMapper {
	//1.查询所有提交作业
	public List<Assignmentlist> getAllAssignment();
	
	//3.查询指定标识码的提交作业
	public List<Assignmentlist> getTheAssignment(String idenCode);
	
	//4.修改更新某个作业的考核状态
	public void updateReview(@Param("ag")Assignmentlist ag , @Param("review")String review);
	
	//5.
	int myInsertTest(Assignmentlist record);
	
    long countByExample(AssignmentlistExample example);

    int deleteByExample(AssignmentlistExample example);

    int deleteByPrimaryKey(Integer subId);

    int insert(Assignmentlist record);

    //2.有条件的插入（可以选择性的插入某些属性，有if判断）
    public int insertSelective(Assignmentlist record);

    List<Assignmentlist> selectByExample(AssignmentlistExample example);

    Assignmentlist selectByPrimaryKey(Integer subId);

    int updateByExampleSelective(@Param("record") Assignmentlist record, @Param("example") AssignmentlistExample example);

    int updateByExample(@Param("record") Assignmentlist record, @Param("example") AssignmentlistExample example);

    int updateByPrimaryKeySelective(Assignmentlist record);

    int updateByPrimaryKey(Assignmentlist record);
}