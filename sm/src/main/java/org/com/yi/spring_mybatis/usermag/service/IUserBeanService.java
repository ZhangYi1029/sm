package org.com.yi.spring_mybatis.usermag.service;

import java.util.List;
import java.util.Map;

import org.com.yi.spring_mybatis.pojos.Page;
import org.com.yi.spring_mybatis.usermag.beans.UserBean;

public interface IUserBeanService {

	public int saveUser(UserBean user);

	public int updateUser(UserBean user);

	public UserBean findUserById(int id);

	public int deleteUserById(int id);

	public UserBean findUserByNameAndPwd(String name, String pwd);

	public int batchSaveUserBean(List<UserBean> list);

	public int batchDeleteUserBean(List<UserBean> list);

	public List<UserBean> queryUserByMap(Map map);

	public int countUserNumber(Map map);

	public Page getUsersListByNameAndPwd(Map map);
}
