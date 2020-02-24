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
	public Integer updateReview(@Param("subId")Integer subId , @Param("review")String review);
	
	//5....
	int myInsertTest(Assignmentlist record);
	
	//6.按照主键删除某个作业：
    public Integer deleteByPrimaryKey(Integer subId);
	
	//7.按照主键删除某些作业：
	public int deleteByPrimaryKeyList(List<Integer> subId);
	
	
    long countByExample(AssignmentlistExample example);

    int deleteByExample(AssignmentlistExample example);

    

    int insert(Assignmentlist record);

    //2.有条件的插入（可以选择性的插入某些属性，有if判断）
    public int insertSelective(Assignmentlist record);

    List<Assignmentlist> selectByExample(AssignmentlistExample example);

    //按照主键sub_id查询作业：
    public Assignmentlist selectByPrimaryKey(Integer subId);

    int updateByExampleSelective(@Param("record") Assignmentlist record, @Param("example") AssignmentlistExample example);

    int updateByExample(@Param("record") Assignmentlist record, @Param("example") AssignmentlistExample example);

    int updateByPrimaryKeySelective(Assignmentlist record);

    int updateByPrimaryKey(Assignmentlist record);
}