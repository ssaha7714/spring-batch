package com.sample.batch.models;

public class Domain {

	private int id;
	private String domain;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}
	
	public Domain() {
		// TODO Auto-generated constructor stub
	}

	public Domain(int id, String domain) {
		super();
		this.id = id;
		this.domain = domain;
	}

	@Override
	public String toString() {
		return "Domain [id=" + id + ", domain=" + domain + "]";
	}

}