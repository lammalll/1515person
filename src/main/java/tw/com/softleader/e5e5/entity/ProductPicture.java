package tw.com.softleader.e5e5.entity;
// Generated 2015/12/14 �U�� 06:49:36 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ProductPicture generated by hbm2java
 */
@Entity
@Table(name = "product_picture", schema = "dbo", catalog = "EEIT82DB")
public class ProductPicture implements java.io.Serializable {

	private int id;
	private Product product;
	private String picture;

	public ProductPicture() {
	}

	public ProductPicture(int id, Product product) {
		this.id = id;
		this.product = product;
	}

	public ProductPicture(int id, Product product, String picture) {
		this.id = id;
		this.product = product;
		this.picture = picture;
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
	@JoinColumn(name = "product_id", nullable = false)
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Column(name = "picture")
	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

}
