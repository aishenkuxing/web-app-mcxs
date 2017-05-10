package com.cn.website.mcxs.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.joda.time.DateTime;

@Entity(name = "goods_info")
public class GoodInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="g_title")
	private String title;
	
	@Column(name="g_price")
	private float price;

	@Column(name="g_unit")
	private String unit;

	@Column(name="g_py")
	private String py;
	
	@Column(name="g_addtime")
	private DateTime addtime;

	@Column(name="g_updatetime")
	private DateTime updatetime;

	@Column(name="g_createtime")
	private DateTime createtime;

	@Column(name="g_createuser")
	private long createuser;
	
	@Column(name="del")
	private int del;

	@Column(name="g_classid")
	private String classid;

	@Column(name="comid")
	private long comid;

	@Column(name="g_memo")
	private String memo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getPy() {
		return py;
	}

	public void setPy(String py) {
		this.py = py;
	}

	public DateTime getAddtime() {
		return addtime;
	}

	public void setAddtime(DateTime addtime) {
		this.addtime = addtime;
	}

	public DateTime getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(DateTime updatetime) {
		this.updatetime = updatetime;
	}

	public DateTime getCreatetime() {
		return createtime;
	}

	public void setCreatetime(DateTime createtime) {
		this.createtime = createtime;
	}

	public long getCreateuser() {
		return createuser;
	}

	public void setCreateuser(long createuser) {
		this.createuser = createuser;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	public String getClassid() {
		return classid;
	}

	public void setClassid(String classid) {
		this.classid = classid;
	}

	public long getComid() {
		return comid;
	}

	public void setComid(long comid) {
		this.comid = comid;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
}
