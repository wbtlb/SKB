package com.sy.skb.entity;

import android.media.Image;
import cn.bmob.v3.BmobObject;


public class ChaoMenu extends BmobObject{
	private String objectId;
	private String cname;
	private String cmethod;
	private String ctaste;
	private Image image;
	private int cgood;
	private String cmaterial;
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCmethod() {
		return cmethod;
	}
	public void setCmethod(String cmethod) {
		this.cmethod = cmethod;
	}
	public String getCtaste() {
		return ctaste;
	}
	public void setCtaste(String ctaste) {
		this.ctaste = ctaste;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public int getCgood() {
		return cgood;
	}
	public void setCgood(int cgood) {
		this.cgood = cgood;
	}
	public String getCmaterial() {
		return cmaterial;
	}
	public void setCmaterial(String cmaterial) {
		this.cmaterial = cmaterial;
	}
}
