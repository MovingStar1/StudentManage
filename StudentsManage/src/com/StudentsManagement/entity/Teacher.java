package com.StudentsManagement.entity;

public class Teacher {
	private int id;
	private String bianhao;
	private String xingming;
	private String xingbie;
	private String nianling;
	private String zhicheng;
	private String loginname;
	private String loginpw;
	private String del;
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
	public String getXingming() {
		return xingming;
	}
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	public String getXingbie() {
		return xingbie;
	}
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	public String getNianling() {
		return nianling;
	}
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	public String getZhicheng() {
		return zhicheng;
	}
	public void setZhicheng(String zhicheng) {
		this.zhicheng = zhicheng;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getLoginpw() {
		return loginpw;
	}
	public void setLoginpw(String loginpw) {
		this.loginpw = loginpw;
	}
	public String getDel() {
		return del;
	}
	public void setDel(String del) {
		this.del = del;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", bianhao=" + bianhao + ", xingming=" + xingming + ", xingbie=" + xingbie
				+ ", nianling=" + nianling + ", zhicheng=" + zhicheng + ", loginname=" + loginname + ", loginpw="
				+ loginpw + ", del=" + del + "]";
	}
	public Teacher(int id, String bianhao, String xingming, String xingbie, String nianling, String zhicheng,
			String loginname, String loginpw, String del) {
		super();
		this.id = id;
		this.bianhao = bianhao;
		this.xingming = xingming;
		this.xingbie = xingbie;
		this.nianling = nianling;
		this.zhicheng = zhicheng;
		this.loginname = loginname;
		this.loginpw = loginpw;
		this.del = del;
	}
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	
}
