/**
 * 
 */
package org.howsun.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.howsun.dao.BaseDao;
import org.howsun.domain.Configuration;
import org.howsun.service.ConfigService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 说明:
 * 
 * @author howsun ->[howsun.zhang@gmail.com]
 * @version 1.0
 *
 * 2017年4月21日 上午11:43:15
 */
@Service
@Transactional
public class ConfigServiceImpl implements ConfigService {

	@Resource
	private BaseDao dao;
	
	
	public void save(Configuration configuration){
		dao.save(configuration);
	}
	
	/* (non-Javadoc)
	 * @see org.howsun.service.impl.ConfigService#init()
	 */
	@Override
	@PostConstruct
	public void init(){
		System.out.println("Service层初始化......" + ConfigServiceImpl.class);
	}
}
