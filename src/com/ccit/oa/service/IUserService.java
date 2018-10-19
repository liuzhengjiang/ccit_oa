package com.ccit.oa.service;

import java.util.List;

import com.ccit.oa.domain.PageBean;
import com.ccit.oa.domain.User;
import com.ccit.oa.utils.HQLHelper;

public interface IUserService {

	public List<User> findAll();

	public void delete(User model);

	public void save(User model);

	public User getById(Long id);

	public void update(User user);

	public int findByLoginName(String loginName);

	public User login(User model);

	public PageBean getPageBean(HQLHelper hh, int currentPage);

}
