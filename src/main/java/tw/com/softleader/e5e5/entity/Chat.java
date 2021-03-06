package tw.com.softleader.e5e5.entity;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Chat generated by hbm2java
 */
@Entity
@Table(name = "chat", schema = "dbo", catalog = "EEIT82DB")
public class Chat implements java.io.Serializable {

	private int id;
	private User user;
	private String messages;
	private String picture;
	private Date sendTime;
	private Character showUserInfo;

	public Chat() {
	}

	public Chat(int id) {
		this.id = id;
	}

	public Chat(int id, User user, String messages, String picture, Date sendTime) {
		this.id = id;
		this.user = user;
		this.messages = messages;
		this.picture = picture;
		this.sendTime = sendTime;
	}



	@Override
	public String toString() {
		return "Chat [id=" + id + ", messages=" + messages + ", picture=" + picture + ", sendTime=" + sendTime
				+ ", showUserInfo=" + showUserInfo + "]";
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "messages", length = 200)
	public String getMessages() {
		return this.messages;
	}

	public void setMessages(String messages) {
		this.messages = messages;
	}

	@Column(name = "picture")
	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "send_time", length = 23)
	public Date getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	@Column(name = "show_user_info", length = 1)
	public Character getShowUserInfo() {
		return showUserInfo;
	}

	public void setShowUserInfo(Character showUserInfo) {
		this.showUserInfo = showUserInfo;
	}

}
