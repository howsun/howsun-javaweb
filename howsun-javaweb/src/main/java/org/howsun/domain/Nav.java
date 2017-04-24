/**
 * 
 */
package org.howsun.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 说明:
 * 
 * @author howsun ->[howsun.zhang@gmail.com]
 * @version 1.0
 *
 * 2017年4月21日 下午7:31:33
 */
@Entity(name = "t_nav")
public class Nav implements Serializable {

	private static final long serialVersionUID = 3796148376751775064L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(length = 16)
	private String name;
	
	/**URL*/
	private String shortname;
	
	/**排序**/
	private Integer sorted;
	
	/**是否单页，如
	 * http://www.domain.com/archives/about.html
	 */
	private boolean single;
	
	/**如果是单页，则需要绑定到文章ID*/
	@Column(name = "archive_id")
	private Integer archiveId;

	
	//-----------------------------------------------------------------------------

	public Nav() {
		super();
	}
	
	public Nav(Integer id) {
		super();
		this.id = id;
	}
	
	
	//-----------------------------------------------------------------------------


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSingle() {
		return single;
	}

	public void setSingle(boolean single) {
		this.single = single;
	}

	public String getShortname() {
		return shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	public Integer getSorted() {
		return sorted;
	}

	public void setSorted(Integer sorted) {
		this.sorted = sorted;
	}

	public Integer getArchiveId() {
		return archiveId;
	}

	public void setArchiveId(Integer archiveId) {
		this.archiveId = archiveId;
	}
	
	
	
	//-------------------------------------------------------------------
	

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
		Nav other = (Nav) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
