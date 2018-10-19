package com.ccit.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;


import org.springframework.stereotype.Service;

import com.ccit.oa.dao.IForumDao;
import com.ccit.oa.domain.Forum;
import com.ccit.oa.domain.PageBean;
import com.ccit.oa.service.IForumService;
import com.ccit.oa.utils.HQLHelper;

/**
 * 参与版块操作
 * @author LIUZHENGJIANG
 *
 */
@Service
@Transactional
public class ForumServiceImpl implements IForumService{
	@Resource
	private IForumDao forumDao;
	public List<Forum> findAll() {
		return forumDao.findAll();
	}
	public Forum getById(Long id) {
		return forumDao.getById(id);
	}
	public PageBean getPageBean(HQLHelper hh, int currentPage) {
		return forumDao.getPageBean(hh, currentPage);
	}
}
