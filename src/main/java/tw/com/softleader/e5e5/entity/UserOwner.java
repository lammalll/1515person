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
 * UserOwner generated by hbm2java
 */
@Entity
@Table(name = "user_owner", schema = "dbo", catalog = "EEIT82DB")
public class UserOwner implements java.io.Serializable {

	private int id;
	private Board board;
	private Integer userId;

	public UserOwner() {
	}

	public UserOwner(int id) {
		this.id = id;
	}

	public UserOwner(int id, Board board, Integer userId) {
		this.id = id;
		this.board = board;
		this.userId = userId;
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
	@JoinColumn(name = "board_id")
	public Board getBoard() {
		return this.board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	@Column(name = "user_id")
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
