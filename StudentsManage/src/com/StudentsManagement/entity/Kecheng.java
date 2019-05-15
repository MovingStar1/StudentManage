package com.StudentsManagement.entity;

public class Kecheng {
	private int id;
	private String bianhao;
	private String mingcheng;
	private String keshi;
	public Kecheng() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "kecheng [id=" + id + ", bianhao=" + bianhao + ", mingcheng="
				+ mingcheng + ", keshi=" + keshi + ", del=" + del + "]";
	}
	public Kecheng(int id, String bianhao, String mingcheng, String keshi,
			String del) {
		super();
		this.id = id;
		this.bianhao = bianhao;
		this.mingcheng = mingcheng;
		this.keshi = keshi;
		this.del = del;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBianhao() {
		return bianhao;
	}
	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}
	public String getMingcheng() {
		return mingcheng;
	}
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	public String getKeshi() {
		return keshi;
	}
	public void setKeshi(String keshi) {
		this.keshi = keshi;
	}
	public String getDel() {
		return del;
	}
	public void setDel(String del) {
		this.del = del;
	}
	String del;
}
