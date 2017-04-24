package org.howsun.dao;

import java.io.Serializable;
import java.util.List;


/**
 * 说明:
 * 
 * @author howsun ->[howsun.zhang@gmail.com]
 * @version 1.0
 *
 * 2017年4月22日 上午11:47:14
 */
public interface BaseDao {

	public abstract void save(Object entity);

	public abstract <T> void delete(Class<T> entityClass, Serializable id);

	public abstract void delete(Object object);

	public abstract <T> T get(Class<T> entityClass, Serializable id);

	public abstract <T> List<T> gets(Class<T> entityClass);

}