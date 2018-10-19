package com.ccit.oa.dao;

import com.ccit.oa.base.IBaseDao;
import com.ccit.oa.domain.Forum;

public interface IForumManageDao extends IBaseDao<Forum>{

	public void  moveUp(Long id);

	public void moveDown(Long id);

}
