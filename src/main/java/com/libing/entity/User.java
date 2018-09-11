package com.libing.entity;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = -2833667183527928437L;
	private String id;
	private String name;
	private String tenantId;
	
	public User(String id, String name, String tenantId) {
		this.id = id;
		this.name = name;
		this.tenantId = tenantId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	
}
