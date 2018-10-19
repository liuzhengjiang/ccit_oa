package com.ccit.oa.dao;

import java.util.List;

import com.ccit.oa.base.IBaseDao;
import com.ccit.oa.domain.Department;

public interface IDepartmentDao extends IBaseDao<Department>{

	public List<Department> findTopList();

	public List<Department> findChildren(Long parentId);

}
