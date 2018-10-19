package com.ccit.oa.service;

import java.util.List;

import com.ccit.oa.domain.Forum;
import com.ccit.oa.domain.PageBean;
import com.ccit.oa.domain.Topic;
import com.ccit.oa.utils.HQLHelper;

public interface ITopicService {

	List<Topic> findTopicByForum(Forum model);

	public void save(Topic model);

	public Topic getById(Long id);

	public PageBean getPageBean(HQLHelper hh, int currentPage);

}
