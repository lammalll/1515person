package tw.com.softleader.e5e5.entity;
// default package
// Generated 2015/12/14 �U�� 08:58:01 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "thread", schema = "dbo", catalog = "EEIT82DB")
public class Thread implements java.io.Serializable {

	private int id;
	private Board board;
	private User user;
	private String title;
	private Date createdDate;
	private String threadContent;
	private Integer hit;
	private Integer replyCount;
	private Date lastReplyDate;
	private Character isReadonly;
	private Character isCream;
	private Character isHide;
	private Character topped;
//	private Set<Report> reports = new HashSet<Report>(0);
//	private Set<ThreadTag> threadTags = new HashSet<ThreadTag>(0);
//	private Set<ForumPicture> forumPictures = new HashSet<ForumPicture>(0);
//	private Set<Board> boards = new HashSet<Board>(0);
//	private Set<Reply> replies = new HashSet<Reply>(0);

	
	@Override
	public String toString() {
		return "Thread [id=" + id + ", title=" + title + ", createdDate=" + createdDate + ", threadContent="
				+ threadContent + ", hit=" + hit + ", replyCount=" + replyCount + ", lastReplyDate=" + lastReplyDate
				+ ", isReadonly=" + isReadonly + ", topped=" + topped + "]";
	}

	public Thread() {
	}

	public Thread(int id, Board board, String title, String threadContent) {
		this.id = id;
		this.board = board;
		this.title = title;
		this.threadContent = threadContent;
	}

	public Thread(int id, User user, String title, Date createdDate,
			String threadContent, Integer hit, Integer replyCount, Date lastReplyDate, Character isReadonly,
			Character topped, Set<Report> reports, Set<ThreadTag> threadTags, Set<ForumPicture> forumPictures,
			Set<Board> boards, Set<Reply> replies) {
		this.id = id;
		this.board = board;
		this.user = user;
		this.title = title;
		this.createdDate = createdDate;
		this.threadContent = threadContent;
		this.hit = hit;
		this.replyCount = replyCount;
		this.lastReplyDate = lastReplyDate;
		this.isReadonly = isReadonly;
		this.topped = topped;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "is_hide", length = 1)	
	public Character getIsHide() {
		return isHide;
	}

	public void setIsHide(Character isHide) {
		this.isHide = isHide;
	}

	@Column(name = "is_cream", length = 1)
	public Character getIsCream() {
		return isCream;
	}

	public void setIsCream(Character isCream) {
		this.isCream = isCream;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "board_id", nullable = false)
	public Board getBoard() {
		return this.board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "title", nullable = false, length = 20)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", length = 23)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "thread_content", nullable = false)
	public String getThreadContent() {
		return this.threadContent;
	}

	public void setThreadContent(String threadContent) {
		this.threadContent = threadContent;
	}

	@Column(name = "hit")
	public Integer getHit() {
		return this.hit;
	}

	public void setHit(Integer hit) {
		this.hit = hit;
	}

	@Column(name = "replay_count")
	public Integer getReplyCount() {
		return this.replyCount;
	}

	public void setReplyCount(Integer replyCount) {
		this.replyCount = replyCount;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_reply_date", length = 23)
	public Date getLastReplyDate() {
		return this.lastReplyDate;
	}

	public void setLastReplyDate(Date lastReplyDate) {
		this.lastReplyDate = lastReplyDate;
	}

	@Column(name = "is_readonly", length = 1)
	public Character getIsReadonly() {
		return this.isReadonly;
	}

	public void setIsReadonly(Character isReadonly) {
		this.isReadonly = isReadonly;
	}

	@Column(name = "topped", length = 1)
	public Character getTopped() {
		return this.topped;
	}

	public void setTopped(Character topped) {
		this.topped = topped;
	}
//	//刪帖刪標籤
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "thread",
//			cascade={ CascadeType.REMOVE})
//	public Set<ThreadTag> getThreadTags() {
//		return this.threadTags;
//	}
//
//	public void setThreadTags(Set<ThreadTag> threadTags) {
//		this.threadTags = threadTags;
//	}
//	//刪帖刪圖
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "thread",
//			cascade={ CascadeType.REMOVE})
//	public Set<ForumPicture> getForumPictures() {
//		return this.forumPictures;
//	}
//
//	public void setForumPictures(Set<ForumPicture> forumPictures) {
//		this.forumPictures = forumPictures;
//	}
//
//	//刪帖刪回覆
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "thread",
//			cascade={ CascadeType.REMOVE})
//	public Set<Reply> getReplies() {
//		return this.replies;
//	}
//
//	public void setReplies(Set<Reply> replies) {
//		this.replies = replies;
//	}

}
