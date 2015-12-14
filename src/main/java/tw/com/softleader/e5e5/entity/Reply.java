package tw.com.softleader.e5e5.entity;
// Generated 2015/12/14 �U�� 06:40:08 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Reply generated by hbm2java
 */
@Entity
@Table(name = "reply", schema = "dbo", catalog = "EEIT82DB")
public class Reply implements java.io.Serializable {

	private int id;
	private Thread thread;
	private Date createdDate;
	private String title;
	private String replyContent;
	private Integer floor;
	private Set<ForumPicture> forumPictures = new HashSet<ForumPicture>(0);

	public Reply() {
	}

	public Reply(int id, String title) {
		this.id = id;
		this.title = title;
	}

	public Reply(int id, Thread thread, Date createdDate, String title, String replyContent, Integer floor,
			Set<ForumPicture> forumPictures) {
		this.id = id;
		this.thread = thread;
		this.createdDate = createdDate;
		this.title = title;
		this.replyContent = replyContent;
		this.floor = floor;
		this.forumPictures = forumPictures;
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
	@JoinColumn(name = "thread_id")
	public Thread getThread() {
		return this.thread;
	}

	public void setThread(Thread thread) {
		this.thread = thread;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", length = 23)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "title", nullable = false, length = 20)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "reply_content", length = 3000)
	public String getReplyContent() {
		return this.replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	@Column(name = "floor")
	public Integer getFloor() {
		return this.floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "reply")
	public Set<ForumPicture> getForumPictures() {
		return this.forumPictures;
	}

	public void setForumPictures(Set<ForumPicture> forumPictures) {
		this.forumPictures = forumPictures;
	}

}
