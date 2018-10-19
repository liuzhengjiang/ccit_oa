package com.ccit.oa.dao;

import java.util.List;

import com.ccit.oa.base.IBaseDao;
import com.ccit.oa.domain.Privilege;

public interface IPrivilegeDao extends IBaseDao<Privilege> {

	public List<Privilege> findTopList();

	public List<String> findAllUrl();

}
