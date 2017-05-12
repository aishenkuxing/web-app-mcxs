package com.cn.website.mcxs.bean;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * 商品分类
 * @author huangjiacheng
 *
 */
@Entity(name = "goods_class")
public class GoodClass implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 60803763950279619L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	/**
	 * 分类名称
	 */
	@Column(name = "cls_name")
	private String name;
	/**
	 * 分类层级
	 */
	@Column(name = "cls_grade")
	private int grade;
	/**
	 * 分类是否结束
	 */
	@Column(name = "cls_end")
	private int end;
	/**
	 * 分类备注
	 */
	@Column(name = "cls_memo")
	private String memo;
	/**
	 * 分类是否删除
	 */
	@Column(name = "cls_del")
	private int del;
	/**
	 * 分类排序
	 */
	@Column(name = "cls_order")
	private int order;
	/**
	 * 分类父节点id
	 */
	@Column(name = "cls_fid")
	private long fid;
	/**
	 * 分类添加时间
	 */
	@Column(name = "cls_addtime")
	private Date addtime;
	/**
	 * 分类更新时间
	 */
	@Column(name = "cls_updatetime")
	private Date updatetime;
	/**
	 * 公司编号
	 */
	@Column(name = "comid")
	private Date comid;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
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

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public long getFid() {
		return fid;
	}

	public void setFid(long fid) {
		this.fid = fid;
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

	public Date getComid() {
		return comid;
	}

	public void setComid(Date comid) {
		this.comid = comid;
	}
}
