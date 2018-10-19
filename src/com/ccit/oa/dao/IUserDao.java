package com.ccit.oa.dao;

import com.ccit.oa.base.IBaseDao;
import com.ccit.oa.domain.User;

public interface IUserDao extends IBaseDao<User> {

	public int findByLoginName(String loginName);

	public User login(User model);

}
