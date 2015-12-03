package tw.com.softleader.e5e5.entity;
// Generated 2015/12/2 �U�� 09:36:37 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Tag generated by hbm2java
 */
@Entity
@Table(name = "tag", schema = "dbo", catalog = "EEIT82DB")
public class Tag implements java.io.Serializable {

	private int id;
	private String name;
	private Set<ThreadTag> threadTags = new HashSet<ThreadTag>(0);

	public Tag() {
	}

	public Tag(int id) {
		this.id = id;
	}

	public Tag(int id, String name, Set<ThreadTag> threadTags) {
		this.id = id;
		this.name = name;
		this.threadTags = threadTags;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tag")
	public Set<ThreadTag> getThreadTags() {
		return this.threadTags;
	}

	public void setThreadTags(Set<ThreadTag> threadTags) {
		this.threadTags = threadTags;
	}

}
