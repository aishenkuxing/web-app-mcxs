package com.cn.website.mcxs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.website.mcxs.bean.GoodsInfo;
import com.cn.website.mcxs.dao.GoodInfoDao;

@Service("goodInfoService")
@Transactional
public class GoodInfoServiceImpl implements GoodInfoService {
	
	@Autowired
	private GoodInfoDao goodInfoDao;
	
	/**
	 * 获取商品信息
	 */
	public GoodsInfo getGoodInfo(long goodId){
		return goodInfoDao.get(GoodsInfo.class, goodId);
	}
	/**
	 * 模糊查询商品
	 */
	@Override
	public List<GoodsInfo> getGoodInfo(String name) {
		return goodInfoDao.getGoodInfo(name);
	}
	/**
	 * 保存商品
	 */
	@Override
	public long saveGoodInfo(GoodsInfo goodInfo) {
		 goodInfoDao.saveOrUpdate(goodInfo);
		 return goodInfo.getId();
	}
}
