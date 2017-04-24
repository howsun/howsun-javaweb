/**
 * 
 */
package org.howsun.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 * 说明:配置
 * 
 * @author howsun ->[howsun.zhang@gmail.com]
 * @version 1.0
 *
 * 2017年4月21日 下午7:30:48
 */
@Entity(name = "t_configuration")
public class Configuration implements Serializable {

	private static final long serialVersionUID = 1L;

	/**配置项**/
	@Id
	@Enumerated(EnumType.STRING)
	@Column(length = 12)
	private ConfigurationKey id;
	
	
	/**配置值**/
	@Lob
	private String content;

	
	//-----------------------------------------------------------------------
	
	public Configuration() {
		super();
	}

	public Configuration(ConfigurationKey id) {
		super();
		this.id = id;
	}

	
	//-----------------------------------------------------------------------


	public ConfigurationKey getId() {
		return id;
	}

	public void setId(ConfigurationKey id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
	
	//---------------------------------------------------------------------------------------
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Configuration other = (Configuration) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
