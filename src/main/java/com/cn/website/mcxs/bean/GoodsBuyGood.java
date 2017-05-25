package com.cn.website.mcxs.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "goods_buy_good")
public class GoodsBuyGood {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "og_title")
	private String title;
	
	@Column(name = "og_price")
	private float og_price;
	
	@Column(name = "og_unit")
	private String unit;
	
	@Column(name = "og_addtime")
	private Date addtime;
	
	@Column(name = "og_num")
	private int num;
	
	@Column(name = "og_oldprice")
	private int oldPrice;
	
	@Column(name = "comid")
	private int comid;
	
	@Column(name = "oderid")
	private int oderid;
	
	@Column(name = "userid")
	private int userid;
	
	@Column(name = "goodid")
	private int goodid;

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

	public float getOg_price() {
		return og_price;
	}

	public void setOg_price(float og_price) {
		this.og_price = og_price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getOldPrice() {
		return oldPrice;
	}

	public void setOldPrice(int oldPrice) {
		this.oldPrice = oldPrice;
	}

	public int getComid() {
		return comid;
	}

	public void setComid(int comid) {
		this.comid = comid;
	}

	public int getOderid() {
		return oderid;
	}

	public void setOderid(int oderid) {
		this.oderid = oderid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getGoodid() {
		return goodid;
	}

	public void setGoodid(int goodid) {
		this.goodid = goodid;
	}
}
