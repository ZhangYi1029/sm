package org.com.yi.spring_mybatis.usermag.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.com.yi.spring_mybatis.pojos.Page;
import org.com.yi.spring_mybatis.usermag.beans.UserBean;

public interface UserMapper {

	//@Insert("insert into users values(null,#{userName},#{userPwd},#{age})")
		public int addUser(UserBean user);
		
		
		public int updateUser(@Param("u")UserBean user);
		
		//@Select("select * from users where u_id=#{id}")
		public UserBean findUserById(int id);
	
		public int deleteUserById(int id);
		
		public UserBean findUserByNameAndPwd(@Param("name")String name,@Param("pwd")String pwd);
		
		public int batchSaveUserBean(@Param("list")List<UserBean> list); 

		public int batchDeleteUserBean(@Param("list")List<UserBean> list);
		
		public List<UserBean> queryUserByMap(@Param("map")Map map);
		
		public int countUserNumber(@Param("map")Map map);
		
		public List getUsersListByNameAndPwd(@Param("map")Map map);
}
