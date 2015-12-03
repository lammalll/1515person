package tw.com.softleader.e5e5.entity;
// Generated 2015/12/2 �U�� 09:36:37 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * School generated by hbm2java
 */
@Entity
@Table(name = "school", schema = "dbo", catalog = "EEIT82DB")
public class School implements java.io.Serializable {

	private int id;
	private User user;
	private String area;
	private Character checkMail;
	private String name;

	public School() {
	}

	public School(int id) {
		this.id = id;
	}

	public School(int id, User user, String area, Character checkMail, String name) {
		this.id = id;
		this.user = user;
		this.area = area;
		this.checkMail = checkMail;
		this.name = name;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "area", length = 15)
	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "check_mail", length = 1)
	public Character getCheckMail() {
		return this.checkMail;
	}

	public void setCheckMail(Character checkMail) {
		this.checkMail = checkMail;
	}

	@Column(name = "name", length = 30)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}