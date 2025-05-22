package com.data.dataentry.dto;

public class ProductsDto{

	private Integer productid;
	private String productname ;
	private String productdesc;
	
	public ProductsDto() {
		super();
	}
	public ProductsDto(Integer productid, String productname, String productdesc) {
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
	@Override
	public String toString() {
		return "ProductsDto [productid=" + productid + ", productname=" + productname + ", productdesc=" + productdesc
				+ "]";
	}
	
	
	
	
	
	
	
}
