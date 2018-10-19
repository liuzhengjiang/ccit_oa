package com.ccit.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;


import org.springframework.stereotype.Service;

import com.ccit.oa.dao.ITopicDao;
import com.ccit.oa.domain.Forum;
import com.ccit.oa.domain.PageBean;
import com.ccit.oa.domain.Topic;
import com.ccit.oa.service.ITopicService;
import com.ccit.oa.utils.HQLHelper;

/**
 * 主题操作
 * @author LIUZHENGJIANG
 *
 */
@Service
@Transactional
public class TopicServiceImpl implements ITopicService{
	@Resource
	private ITopicDao topicDao;
	public List<Topic> findTopicByForum(Forum model) {
		return topicDao.findTopicByForum(model);
	}
	/**
	 * 发表主题
	 */
	public void save(Topic model) {
		topicDao.save(model);//model为持久对象
		
		Forum forum = model.getForum();//forum为持久对象
		
		forum.setTopicCount(forum.getTopicCount() + 1);//当前主题所在版块的主题数量加1
		forum.setArticleCount(forum.getArticleCount() + 1);//当前主题所在版块的文章数量加1
		forum.setLastTopic(model);//设置版块的最后发表的主题为当前主题
	}

	/**
	 * 根据id查询主题
	 */
	public Topic getById(Long id) {
		return topicDao.getById(id);
	}

	/**
	 * 分页查询
	 */
	public PageBean getPageBean(HQLHelper hh, int currentPage) {
		return topicDao.getPageBean(hh, currentPage);
	}

}
