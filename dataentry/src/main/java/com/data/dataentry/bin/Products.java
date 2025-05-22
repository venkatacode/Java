package com.data.dataentry.bin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="products_data",
schema="Products",
uniqueConstraints={
	@UniqueConstraint(name="product_name",
			columnNames="product_name"),
}
)
public class Products {
	@Id
	@Column(name="product_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer productid;
	
	@Column(name="product_name",nullable=false)
	private String productname ;
	
	@Column(name="product_desc",nullable=false)
	private String productdesc;
	
	public Products() {
		super();
	}
	public Products(Integer productid, String productname, String productdesc) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productdesc = productdesc;
		
	}
	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductdesc() {
		return productdesc;
	}

	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}


	

}
