package com.ccit.oa.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ccit.oa.base.BaseDaoImpl;
import com.ccit.oa.dao.IForumDao;
import com.ccit.oa.domain.Forum;

/**
 * 参与版块操作
 * @author LIUZHENGJIANG
 *
 */
@Repository
@SuppressWarnings("unchecked")
public class ForumDaoImpl extends BaseDaoImpl<Forum> implements IForumDao{
	/**
	 * 查询板块列表，按照position属性进行排序
	 */
	public List<Forum> findAll() {
		String hql = "FROM Forum f ORDER BY f.position";
		return this.getSession().createQuery(hql).list();
	}

}
