package com.ccit.oa.dao;

import java.util.List;

import com.ccit.oa.domain.PageBean;
import com.ccit.oa.domain.Reply;
import com.ccit.oa.domain.Topic;

import com.ccit.oa.base.IBaseDao;

public interface IReplyDao extends IBaseDao<Reply>{

	public List<Reply> getReplyByTopic(Topic model);

	public PageBean getPageBean(int currentPage, Topic model);
	
}
