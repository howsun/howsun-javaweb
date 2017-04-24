/**
 * 
 */
package org.howsun.domain;

/**
 * 说明:
 * 
 * @author howsun ->[howsun.zhang@gmail.com]
 * @version 1.0
 *
 * 2017年4月21日 下午7:55:55
 */
public enum ConfigurationKey{

	DOMAIN("网站域名"),
	SITENAME("网站名称"),
	COMPANY("公司名称"),
	ICP("备案号码"),
	;
	
	private String displayName;
	private ConfigurationKey(String displayName){
		this.displayName = displayName;
	}
	
	public String getDisplayName(){
		return this.displayName;
	}
	
	public String getName(){
		return name();
	}
	
	public int getOrdinal(){
		return ordinal();
	}
}
