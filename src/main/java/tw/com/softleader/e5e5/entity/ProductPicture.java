package tw.com.softleader.e5e5.entity;
// default package
// Generated 2015/12/14 �U�� 08:58:01 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
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

/**
 * ProductPicture generated by hbm2java
 */
@Entity
@Table(name = "product_picture", schema = "dbo", catalog = "EEIT82DB")
public class ProductPicture implements java.io.Serializable {

	private int id;
	private Product product;
	private String picture;
	private Set<Product> products = new HashSet<Product>(0);

	public ProductPicture() {
	}

	public ProductPicture(int id, Product product) {
		this.id = id;
		this.product = product;
	}

	public ProductPicture(int id, Product product, String picture, Set<Product> products) {
		this.id = id;
		this.product = product;
		this.picture = picture;
		this.products = products;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productPicture")
	public Set<Product> getProducts() {
		return this.products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}
