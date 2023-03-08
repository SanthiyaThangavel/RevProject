package com.example.demo.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Task1 {
	@Id
	private int Product_Id;
	private String Product_Name;
	private String Brand_Id;
	private String CustName;
	private int CustId;
	public Task1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Task1(int product_Id, String product_Name, String brand_Id, String custName, int custId) {
		super();
		Product_Id = product_Id;
		Product_Name = product_Name;
		Brand_Id = brand_Id;
		CustName = custName;
		CustId = custId;
	}
	public int getProduct_Id() {
		return Product_Id;
	}
	public void setProduct_Id(int product_Id) {
		Product_Id = product_Id;
	}
	public String getProduct_Name() {
		return Product_Name;
	}
	public void setProduct_Name(String product_Name){
		Product_Name = product_Name;
	}
	public String getBrand_Id() {
		return Brand_Id;
	}
	public void setBrand_Id(String brand_Id) {
		Brand_Id = brand_Id;
	}
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	public int getCustId() {
		return CustId;
	}
	public void setCustId(int custId) {
		CustId = custId;
	}
	
	
	
}
