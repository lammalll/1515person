package tw.com.softleader.e5e5.entity;
// Generated 2015/12/2 �U�� 07:16:55 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ThreadTag generated by hbm2java
 */
@Entity
@Table(name = "thread_tag", schema = "dbo", catalog = "EEIT82DB")
public class ThreadTag implements java.io.Serializable {

	private int id;
	private Tag tag;
	private Thread thread;

	public ThreadTag() {
	}

	public ThreadTag(int id) {
		this.id = id;
	}

	public ThreadTag(int id, Tag tag, Thread thread) {
		this.id = id;
		this.tag = tag;
		this.thread = thread;
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
	@JoinColumn(name = "tag_id")
	public Tag getTag() {
		return this.tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "thread_id")
	public Thread getThread() {
		return this.thread;
	}

	public void setThread(Thread thread) {
		this.thread = thread;
	}

}
