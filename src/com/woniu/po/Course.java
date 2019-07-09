package com.woniu.po;

public class Course {

	private int cid;
	private int tid; 
	private int sid;
	private String cname;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Course(int cid, int tid, int sid, String cname) {
		super();
		this.cid = cid;
		this.tid = tid;
		this.sid = sid;
		this.cname = cname;
	}
	public Course() {
		super();
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", tid=" + tid + ", sid=" + sid + ", cname=" + cname + "]";
	}
	
}
