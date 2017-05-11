package com.cn.website.mcxs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.website.mcxs.bean.GoodInfo;
import com.cn.website.mcxs.dao.GoodInfoDao;

@Service("goodInfoService")
@Transactional
public class GoodInfoServiceImpl implements GoodInfoService {
	
	@Autowired
	private GoodInfoDao goodInfoDao;
	
	/**
	 * 获取商品信息
	 */
	public GoodInfo getGoodInfo(long goodId){
		return goodInfoDao.get(GoodInfo.class, goodId);
	}
}
