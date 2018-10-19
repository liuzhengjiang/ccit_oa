package com.ccit.oa.dao.impl;

import org.springframework.stereotype.Repository;

import com.ccit.oa.base.BaseDaoImpl;
import com.ccit.oa.dao.IBookDao;
import com.ccit.oa.domain.Book;
/**
 * BookDao，继承BaseDaoImpl
 * @author LIUZHENGJIANG
 *
 */
@Repository
public class BookDaoImpl extends BaseDaoImpl<Book> implements IBookDao {

}
