package com.cn.website.mcxs.bean;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.joda.time.DateTime;

@Entity(name = "goods_info")
public class GoodInfo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 60803763950279619L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="g_title")
	private String title;
	
	@Column(name="g_price")
	private float price;
	
	@Column(name="g_oldprice")
	private float oldprice;

	@Column(name="g_unit")
	private String unit;

	@Column(name="g_py")
	private String py;
	
	@Column(name="g_addtime")
	private Date addtime;

	@Column(name="g_updatetime")
	private Date updatetime;

	@Column(name="g_createtime")
	private Date createtime;

	@Column(name="g_createuser")
	private long createuser;
	
	@Column(name="del")
	private int del;

	@Column(name="g_classid")
	private long classid;

	@Column(name="comid")
	private long comid;
	
	@Column(name="g_stock")
	private int stock;
	
	@Column(name="userid")
	private long userid;

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

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
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

	public long getClassid() {
		return classid;
	}

	public void setClassid(long classid) {
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

	public float getOldprice() {
		return oldprice;
	}

	public void setOldprice(float oldprice) {
		this.oldprice = oldprice;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}
	
	
}
