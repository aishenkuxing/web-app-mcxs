package com.cn.website.mcxs.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * 商品地址
 * @author huangjiacheng
 *
 */
@Entity(name = "goods_address")
public class GoodsAdress implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "addr_detail")
	private String detail;
	
	@Column(name = "addr_province")
	private String province;
	
	@Column(name = "addr_city")
	private String city;
	
	@Column(name = "addr_area")
	private String area;
	
	@Column(name = "addr_lat")
	private float lat;
	
	@Column(name = "addr_lgt")
	private float lgt;
	
	@Column(name = "addr_postcode")
	private String postcode;
	
	@Column(name = "addr_phone")
	private int phone;
	
	@Column(name = "addr_person")
	private String person;
	
	@Column(name = "memo")
	private String memo;
	
	@Column(name = "del")
	private int del;
	
	@Column(name = "use")
	private int use;
	
	@Column(name = "userid")
	private long userid;
	
	@Column(name = "comid")
	private long comid;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public float getLat() {
		return lat;
	}

	public void setLat(float lat) {
		this.lat = lat;
	}

	public float getLgt() {
		return lgt;
	}

	public void setLgt(float lgt) {
		this.lgt = lgt;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	public int getUse() {
		return use;
	}

	public void setUse(int use) {
		this.use = use;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public long getComid() {
		return comid;
	}

	public void setComid(long comid) {
		this.comid = comid;
	}
	
	
}
