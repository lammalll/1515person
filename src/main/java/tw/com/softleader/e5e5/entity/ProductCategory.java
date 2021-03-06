package tw.com.softleader.e5e5.entity;
// Generated 2015/12/13 下午 03:39:44 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ProductCategory generated by hbm2java
 */
@Entity
@Table(name = "product_category", schema = "dbo", catalog = "EEIT82DB")
public class ProductCategory implements java.io.Serializable {

	private int id;
	private String name;
	private Set<Product> products = new HashSet<Product>(0);

	public ProductCategory() {
	}

	public ProductCategory(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public ProductCategory(int id, String name, Set<Product> products) {
		this.id = id;
		this.name = name;
		this.products = products;
	}

	
	@Override
	public String toString() {
		return "ProductCategory [id=" + id + ", name=" + name + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productCategory")
	public Set<Product> getProducts() {
		return this.products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}
