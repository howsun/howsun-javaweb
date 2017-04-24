/**
 * 
 */
package org.howsun.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 * 说明:
 * 
 * @author howsun ->[howsun.zhang@gmail.com]
 * @version 1.0
 *
 * 2017年4月22日 上午11:35:41
 */
@Repository
public class BaseDaoImpl implements BaseDao {

	@Resource
	private SessionFactory sessionFactory;
	
	
	/* (non-Javadoc)
	 * @see org.howsun.dao.BaseDao#save(java.lang.Object)
	 */
	@Override
	public void save(Object entity){
		Session session = sessionFactory.getCurrentSession();
		session.save(entity);
	}
	
	
	/* (non-Javadoc)
	 * @see org.howsun.dao.BaseDao#delete(java.lang.Class, java.io.Serializable)
	 */
	@Override
	public <T> void delete(Class<T> entityClass, Serializable id){
		Session session = sessionFactory.getCurrentSession();
		Object object = session.load(entityClass, id);
		delete(object);
	}
	
	
	/* (non-Javadoc)
	 * @see org.howsun.dao.BaseDao#delete(java.lang.Object)
	 */
	@Override
	public void delete(Object object){
		sessionFactory.getCurrentSession().delete(object);
	}
	
	
	/* (non-Javadoc)
	 * @see org.howsun.dao.BaseDao#get(java.lang.Class, java.io.Serializable)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public <T> T get(Class<T> entityClass, Serializable id){
		Session session = sessionFactory.getCurrentSession();
		return (T)session.get(entityClass, id);
	}
	
	
	/* (non-Javadoc)
	 * @see org.howsun.dao.BaseDao#gets(java.lang.Class)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public <T> List<T> gets(Class<T> entityClass){
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from " + entityClass.getName());
		return (List<T>)query.list();
	}
	
}
