package com.ccit.oa.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ccit.oa.base.BaseDaoImpl;
import com.ccit.oa.dao.IPrivilegeDao;
import com.ccit.oa.domain.Privilege;

/**
 * 权限管理
 * @author LIUZHENGJIANG
 *
 */
@Repository
@SuppressWarnings("unchecked")
public class PrivilegeDaoImpl extends BaseDaoImpl<Privilege> implements IPrivilegeDao{
	/**
	 * 查询顶级权限列表
	 */
	public List<Privilege> findTopList() {
		String hql = "FROM Privilege p WHERE p.parent IS NULL";
		return this.getSession().createQuery(hql).list();
	}

	/**
	 * 查询所有权限对应的URL
	 */
	public List<String> findAllUrl() {
		String hql = "SELECT url FROM Privilege WHERE url IS NOT NULL";
		return this.getSession().createQuery(hql).list();
	}
}
