package com.thenurserysystem.bean;

public class Category {
	@Override
	public String toString() {
		return "Category [subcat_id=" + subcat_id + ", cat_id=" + cat_id + ", cat_name=" + cat_name + ", subcat_name="
				+ subcat_name + ", status=" + status + "]";
	}
	private int subcat_id;
	public int getSubcat_id() {
		return subcat_id;
	}
	public void setSubcat_id(int subcat_id) {
		this.subcat_id = subcat_id;
	}
	private int cat_id;
	private String cat_name;
	private String subcat_name;
	private int status;
	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	public String getCat_name() {
		return cat_name;
	}
	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getSubcat_name() {
		return subcat_name;
	}
	public void setSubcat_name(String subcat_name) {
		this.subcat_name = subcat_name;
	}
	
}
