package com.ccit.oa.service;

import java.util.List;

import com.ccit.oa.domain.Privilege;
import com.ccit.oa.domain.Role;

public interface IPrivilegeService {

	public List<Privilege> findAll();

	public List<Privilege> getByIds(Long[] privilegeIds);

	public List<Privilege> findTopList();

	public List<String> findAllUrl();

}
