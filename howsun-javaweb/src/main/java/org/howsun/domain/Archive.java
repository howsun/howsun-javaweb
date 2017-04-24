/**
 * 
 */
package org.howsun.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 说明:
 * 
 * @author howsun ->[howsun.zhang@gmail.com]
 * @version 1.0
 * 
 * http://www.domain.com/archive/aboutme.html
 * http://www.domain.com/archive/1.html
 * 
 * 2017年4月21日 下午7:31:16
 */
@Entity(name = "t_archive")
public class Archive implements Serializable {

	private static final long serialVersionUID = 1L;
		
	/**主键*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	/**URL上的简称
	@Column(length = 16)
	private String shortname;
	**/
	
	/**标题*/
	@Column(length = 64)
	private String title;
	
	/**摘要*/
	@Column(length = 128)
	private String summary;
	
	/**内容*/
	@Lob //clob,blob
	private String content;
	
	/**封面图*/
	@Column(length = 64)
	private String cover;
	
	/**分类**/
	@ManyToOne(cascade = CascadeType.REFRESH, fetch =FetchType.EAGER)
	@JoinColumn(name = "category")
	private Category category;
	
	/**点击量*/
	private Integer hits;
	
	/**创建时间*/
	@Temporal(TemporalType.TIMESTAMP)
	private Date created;
	
	/**更新时间*/
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated;


	//---------------------------------------------------------------------
	

	public Archive() {
		super();
	}

	public Archive(Integer id) {
		super();
		this.id = id;
	}

	
	//---------------------------------------------------------------------

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Integer getHits() {
		return hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
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
		Archive other = (Archive) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
