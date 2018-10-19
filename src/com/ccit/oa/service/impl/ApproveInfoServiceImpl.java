package com.ccit.oa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ccit.oa.dao.IApproveInfoDao;
import com.ccit.oa.domain.ApproveInfo;
import com.ccit.oa.service.IApproveInfoService;

/**
 * 审批操作
 * @author LIUZHENGJIANG
 *
 */
@Service
@Transactional
public class ApproveInfoServiceImpl implements IApproveInfoService{
	@Resource
	private IApproveInfoDao approveInfoDao;

	/**根据申请id查询对应的审批集合
	 * 
	 */
	public List<ApproveInfo> findApproveInfoListByApplicationId(
			Long applicationId) {
		return approveInfoDao.findApproveInfoListByApplicationId(applicationId);
	}
}
