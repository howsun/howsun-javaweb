/**
 * 
 */
package org.howsun.mvc;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.ServletContext;

import org.howsun.service.ConfigService;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * 说明:
 * 
 * @author howsun ->[howsun.zhang@gmail.com]
 * @version 1.0
 *
 * 2017年4月20日 下午4:45:56
 */
@Controller
public class HomeController {

	/*
	@Autowired
	@Qualifier("configService")
	*/
	@Resource
	private ConfigService configService;
	
	@Resource
	private ServletContext servletContext;
	
	@RequestMapping("/home")
	public String home(){
		return "home";
	}
	
	@PostConstruct
	public void init(){
		System.out.println("Web层初始化......" + HomeController.class);
		
		ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
		
		ConfigService configService = applicationContext.getBean(ConfigService.class);
		
		System.out.println(this.configService);
		System.out.println(configService);
		System.out.println(this.configService == configService);
	}
}
