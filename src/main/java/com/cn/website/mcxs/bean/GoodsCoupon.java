package com.cn.website.mcxs.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 优惠券
 * 
 * @author Administrator
 *
 */

@Entity(name = "goods_coupon")
public class GoodsCoupon implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "cp_price")
	private float price;
	/**
	 *0.未使用 1.已经使用 
	 */
	@Column(name = "cp_state")
	private float state;
	
	@Column(name = "cp_title")
	private String title;
	
	@Column(name = "cp_addtime")
	private String addtime;
	
	@Column(name = "userid")
	private String userid;
	
	@Column(name = "comid")
	private String comid;
	
	@Column(name = "orderid")
	private String orderid;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getState() {
		return state;
	}

	public void setState(float state) {
		this.state = state;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAddtime() {
		return addtime;
	}

	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getComid() {
		return comid;
	}

	public void setComid(String comid) {
		this.comid = comid;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	
}
