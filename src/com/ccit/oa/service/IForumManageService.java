package com.ccit.oa.service;

import java.util.List;

import com.ccit.oa.domain.Forum;
import com.ccit.oa.domain.PageBean;
import com.ccit.oa.utils.HQLHelper;

public interface IForumManageService {

	public List<Forum> findAll();

	public void delete(Forum model);

	public void save(Forum model);

	public Forum getById(Long id);

	public void update(Forum forum);

	public void moveUp(Long id);

	public void moveDown(Long id);

	public PageBean getPageBean(HQLHelper hh, int currentPage);

}
