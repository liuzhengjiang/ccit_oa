package com.ccit.oa.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.ccit.oa.dao.IReplyDao;
import com.ccit.oa.domain.PageBean;
import com.ccit.oa.domain.Reply;
import com.ccit.oa.domain.Topic;

import com.ccit.oa.base.BaseDaoImpl;

/**
 * 回复操作
 * @author LIUZHENGJIANG
 *
 */
@Repository
@SuppressWarnings("unchecked")
public class ReplyDaoImpl extends BaseDaoImpl<Reply> implements IReplyDao{
	/**
	 * 根据主题查询对应的回复列表
	 */
	public List<Reply> getReplyByTopic(Topic model) {
		String hql = "FROM Reply r WHERE r.topic = ? ORDER BY r.postTime ASC";
		Query query = this.getSession().createQuery(hql);
		query.setParameter(0, model);
		return query.list();
	}

	/**
	 * 分页查询
	 */
	public PageBean getPageBean(int currentPage, Topic model) {
		int pageSize = 10;
		int firstResult = (currentPage - 1) * pageSize;
		String hql = "FROM Reply r WHERE r.topic = ? ORDER BY r.postTime ASC";
		Query query = this.getSession().createQuery(hql);
		query.setParameter(0, model);
		query.setFirstResult(firstResult);
		query.setMaxResults(pageSize);
		List recordList = query.list();
		
		hql = "SELECT COUNT(id) FROM Reply r WHERE r.topic = ?";
		query = this.getSession().createQuery(hql);
		query.setParameter(0, model);
		Long recordCount = (Long) query.uniqueResult();
		return new PageBean(currentPage, pageSize, recordCount.intValue(), recordList);
	}

}
