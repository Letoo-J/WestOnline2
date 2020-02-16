package com.mine.mapper;

import com.mine.bean.Assess;
import com.mine.bean.AssessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssessMapper {
	//1.查询所有考核
	public List<Assess> getAllAssesses();
	
	//3.按考核标识码idenCode查询是否某考核已经存在 【不存在则返回null】
	public Integer isExistAssess(String idenCode);
	
	//4.按考核标识码idenCode删除指定考核信息
	public Integer assessDelete(String idenCode);
	
	//5.根据考核标识码idenCode得到此考核记录
	public Assess selectAssess(String idenCode);
	
	//6.修改更新考核
	public Integer updateAssess(Assess as); 
 	
	//按条件查询
    long countByExample(AssessExample example);

    //按条件删除
    int deleteByExample(AssessExample example);

    //根据主键删除
    int deleteByPrimaryKey(Integer assesId);

    //插入一条记录（插入全表（每个属性都添加），无if判断）
    int insert(Assess record);
    
    //2.有条件的插入（可以选择性的插入某些属性，有if判断）：返回插入条数！
    int insertSelective(Assess record);

    //按条件查询
    List<Assess> selectByExample(AssessExample example);

    //按主键查询
    Assess selectByPrimaryKey(Integer assesId);

    //按条件去选择性的更新
    int updateByExampleSelective(@Param("record") Assess record, @Param("example") AssessExample example);

    //按条件更新
    int updateByExample(@Param("record") Assess record, @Param("example") AssessExample example);

    //按主键去更新
    int updateByPrimaryKeySelective(Assess record);

    //按按主键选择性的更新
    int updateByPrimaryKey(Assess record);
}