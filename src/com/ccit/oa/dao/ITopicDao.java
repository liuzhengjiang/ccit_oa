package com.ccit.oa.dao;

import java.util.List;

import com.ccit.oa.base.IBaseDao;
import com.ccit.oa.domain.Forum;
import com.ccit.oa.domain.Topic;

public interface ITopicDao extends IBaseDao<Topic>{

	public List<Topic> findTopicByForum(Forum model);

}
