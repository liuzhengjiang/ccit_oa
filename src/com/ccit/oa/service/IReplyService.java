package com.ccit.oa.service;

import java.util.List;

import com.ccit.oa.domain.PageBean;
import com.ccit.oa.domain.Reply;
import com.ccit.oa.domain.Topic;
import com.ccit.oa.utils.HQLHelper;

public interface IReplyService {

	public void save(Reply model);

	public List<Reply> getReplyByTopic(Topic model);

	public PageBean getPageBean(int currentPage, Topic model);

	public PageBean getPageBean(HQLHelper hh, int currentPage);

}
