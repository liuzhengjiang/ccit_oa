package com.ccit.oa.service;

import java.io.InputStream;

import com.ccit.oa.domain.Application;
import com.ccit.oa.domain.PageBean;
import com.ccit.oa.utils.HQLHelper;

public interface IApplicationservice {

	public PageBean getPageBean(HQLHelper hh, int currentPage);

	public InputStream getInputStreamById(Long applicationId);

	public Application getById(Long applicationId);

}
