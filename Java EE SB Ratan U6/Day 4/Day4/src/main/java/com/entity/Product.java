package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "MyProduct")
public class Product
{
	@Id
	@Column(name = "pdid")
	private int did;

	@Column(name = "sname")
	private String pname;

	@Transient
	private int price;

	public Product(int did, String pname, int price)
	{
		super();
		this.did = did;
		this.pname = pname;
		this.price = price;
	}

	public Product()
	{
		super();
	}

	public int getDid()
	{
		return did;
	}

	public void setDid(int did)
	{
		this.did = did;
	}

	public String getPname()
	{
		return pname;
	}

	public void setPname(String pname)
	{
		this.pname = pname;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	@Override
	public String toString()
	{
		return "Product [did=" + did + ", pname=" + pname + ", price=" + price + "]";
	}

}
