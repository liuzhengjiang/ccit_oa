package com.ccit.oa.service;

import java.util.List;

import com.ccit.oa.domain.Application;
import com.ccit.oa.domain.ApproveInfo;
import com.ccit.oa.domain.TaskView;
import com.ccit.oa.domain.User;

public interface IFlowService {

	public void submit(Application app);

	public List<TaskView> findTaskList(User currentUser);

	public void approve(ApproveInfo ai, String taskId);

}
