package com.mine.mapper;

import com.mine.bean.Admin;
import com.mine.bean.AdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
	//根据id查找Admin
	public Admin selectAdminByID(Integer id);
	
	//根据name和password查找Admin
	public Admin selectAdminByAP(@Param("adminName")String adminName , @Param("password")String password);
	
	//根据Admin对象查找Admin
	public Admin selectAdminByAP2(Admin ad);
	
	//判断管理员账户是否存在
	public List<Admin> isExistAdmin(String adminName);
	
    long countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int deleteByPrimaryKey(Integer aId);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    Admin selectByPrimaryKey(Integer aId);

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}