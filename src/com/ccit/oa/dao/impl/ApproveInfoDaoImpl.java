package com.ccit.oa.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.ccit.oa.base.BaseDaoImpl;
import com.ccit.oa.dao.IApproveInfoDao;
import com.ccit.oa.domain.ApproveInfo;
/**
 * 审批操作
 * @author LIUZHENGJIANG
 *
 */

@Repository
public class ApproveInfoDaoImpl extends BaseDaoImpl<ApproveInfo> implements IApproveInfoDao{

	/**
	 * 根据申请的id查询审批集合
	 */
	public List<ApproveInfo> findApproveInfoListByApplicationId(
			Long applicationId) {
		String hql = "FROM ApproveInfo ai WHERE ai.application.id = ? ORDER BY ai.approveTime ASC";
		Query query = this.getSession().createQuery(hql);
		query.setParameter(0, applicationId);
		
		return query.list();
	}

}
 