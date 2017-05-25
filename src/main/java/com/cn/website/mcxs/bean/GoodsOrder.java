package com.cn.website.mcxs.bean;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "goods_order")
public class GoodsOrder implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	/**
	 *  订单总金额，单位为分，详见支付金额
	 */
	@Column(name = "total_fee")
	private float totalFee;
	/**
	 * 商品简单描述，该字段请按照规范传递
	 */
	@Column(name = "body")
	private String body;
	
	@Column(name = "detail")
	private String detail;
	/**
	 * 标价币种,符合ISO 4217标准的三位字母代码，默认人民币：CNY，详细列表请参见
	 */
	@Column(name = "fee_type")
	private String fee_type;
	/**
	 * 订单生效日期
	 */
	@Column(name = "time_start")
	private Date timeStart;
	/**
	 * 订单失效时间
	 */
	@Column(name ="time_expire")
	private Date timeExpire;
	/**
	 * 订单优惠标记，使用代金券或立减优惠功能时需要的参数
	 */
	@Column(name ="goods_tag")
	private String goodsTag;
	
	/**
	 * 用户微信id 唯一标识
	 */
	@Column(name ="openid")
	private String openid;
	
	/**
	 * 上传此参数no_credit可限制用户不能使用信用卡支付
	 */
	@Column(name ="limit_pay")
	private String limitPay;
	
	/**
	 * 微信返回的订单信息ID
	 */
	@Column(name ="prepayid")
	private String prepayid;
	/**
	 * 0.未支付  1.已支付
	 */
	@Column(name ="od_paystate")
	private int paystate;
	/**
	 * 0.未发货 1.已发货
	 */
	@Column(name ="od_sendstate")
	private int sendstate;
	/**
	 * 已付金额
	 */
	@Column(name ="od_paymoney")
	private float paymoney;
	
	/**
	 * 收获地址
	 */
	@Column(name ="od_addr")
	private String addr;
	
	private long comid;
	
	private long userid;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(float totalFee) {
		this.totalFee = totalFee;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getFee_type() {
		return fee_type;
	}

	public void setFee_type(String fee_type) {
		this.fee_type = fee_type;
	}

	public Date getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(Date timeStart) {
		this.timeStart = timeStart;
	}

	public Date getTimeExpire() {
		return timeExpire;
	}

	public void setTimeExpire(Date timeExpire) {
		this.timeExpire = timeExpire;
	}

	public String getGoodsTag() {
		return goodsTag;
	}

	public void setGoodsTag(String goodsTag) {
		this.goodsTag = goodsTag;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getLimitPay() {
		return limitPay;
	}

	public void setLimitPay(String limitPay) {
		this.limitPay = limitPay;
	}

	public String getPrepayid() {
		return prepayid;
	}

	public void setPrepayid(String prepayid) {
		this.prepayid = prepayid;
	}

	public int getPaystate() {
		return paystate;
	}

	public void setPaystate(int paystate) {
		this.paystate = paystate;
	}

	public int getSendstate() {
		return sendstate;
	}

	public void setSendstate(int sendstate) {
		this.sendstate = sendstate;
	}

	public float getPaymoney() {
		return paymoney;
	}

	public void setPaymoney(float paymoney) {
		this.paymoney = paymoney;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public long getComid() {
		return comid;
	}

	public void setComid(long comid) {
		this.comid = comid;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}
	
}
