package com.ccit.oa.dao;

import java.util.List;

import com.ccit.oa.base.IBaseDao;
import com.ccit.oa.domain.ApproveInfo;

public interface IApproveInfoDao extends IBaseDao<ApproveInfo>{

	public List<ApproveInfo> findApproveInfoListByApplicationId(Long applicationId);

}
