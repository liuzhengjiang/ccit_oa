package com.ccit.oa.service;

import java.util.List;

import com.ccit.oa.domain.Forum;
import com.ccit.oa.domain.PageBean;
import com.ccit.oa.utils.HQLHelper;

public interface IForumService {

	public List<Forum> findAll();

	public Forum getById(Long id);

	public PageBean getPageBean(HQLHelper hh, int currentPage);

}
