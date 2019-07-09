package com.woniu.po;

public class Teacher {
	//ΩÃ ¶±Ì
	private int tid;
	private String tname;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Teacher(int tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}
	public Teacher() {
		super();
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + "]";
	}
	
}
