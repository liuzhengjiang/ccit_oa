package com.ccit.oa.service;

import java.util.List;

import com.ccit.oa.domain.ApproveInfo;

public interface IApproveInfoService {

	public List<ApproveInfo> findApproveInfoListByApplicationId(Long applicationId);

}
