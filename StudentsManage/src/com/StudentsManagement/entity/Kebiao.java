package com.StudentsManagement.entity;


public class Kebiao {
	private int kecheng_id;
	private String shijian;
	private String jieci;
	private String jiaoshi;
	private int laoshi_id;
	private Kecheng kecheng;
	private Teacher teacher;
	public int getKecheng_id() {
		return kecheng_id;
	}
	public void setKecheng_id(int kecheng_id) {
		this.kecheng_id = kecheng_id;
	}
	public String getShijian() {
		return shijian;
	}
	public void setShijian(String shijian) {
		this.shijian = shijian;
	}
	public String getJieci() {
		return jieci;
	}
	public void setJieci(String jieci) {
		this.jieci = jieci;
	}
	public String getJiaoshi() {
		return jiaoshi;
	}
	public void setJiaoshi(String jiaoshi) {
		this.jiaoshi = jiaoshi;
	}
	public int getLaoshi_id() {
		return laoshi_id;
	}
	public void setLaoshi_id(int laoshi_id) {
		this.laoshi_id = laoshi_id;
	}
	public Kecheng getKecheng() {
		return kecheng;
	}
	public void setKecheng(Kecheng kecheng) {
		this.kecheng = kecheng;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Kebiao [kecheng_id=" + kecheng_id + ", shijian=" + shijian
				+ ", jieci=" + jieci + ", jiaoshi=" + jiaoshi + ", laoshi_id="
				+ laoshi_id + ", kecheng=" + kecheng + ", teacher=" + teacher
				+ "]";
	}
	public Kebiao(int kecheng_id, String shijian, String jieci, String jiaoshi,
			int laoshi_id, Kecheng kecheng, Teacher teacher) {
		super();
		this.kecheng_id = kecheng_id;
		this.shijian = shijian;
		this.jieci = jieci;
		this.jiaoshi = jiaoshi;
		this.laoshi_id = laoshi_id;
		this.kecheng = kecheng;
		this.teacher = teacher;
	}
	public Kebiao() {
		// TODO Auto-generated constructor stub
	}
	
}
