package com.ccit.oa.dao.impl;

import java.io.File;

import org.springframework.stereotype.Repository;

import com.ccit.oa.dao.ITemplateDao;
import com.ccit.oa.domain.Template;

import com.ccit.oa.base.BaseDaoImpl;

/**
 * 模板管理
 * @author LIUZHENGJIANG
 *
 */
@Repository
public class TemplateDaoImpl extends BaseDaoImpl<Template> implements ITemplateDao {

	/**
	 * 重写删除方法，删除模板对象时，删除对应的文件
	 */
	public void delete(Long id) {
		Template template = super.getById(id);
		String filePath = template.getFilePath();//获得文件的存储路径
		
		//删除文件
		File file = new File(filePath);
		if(file.exists()){
			file.delete();
		}
		super.delete(id);//删除数据
	}

}
