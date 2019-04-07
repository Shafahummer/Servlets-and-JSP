package com.shait.web.model;

public class Alien {
	
private int aid;
private String aname;
private String course;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
@Override
public String toString() {
	return "Alien [aid=" + aid + ", aname=" + aname + ", course=" + course + "]";
}



}
