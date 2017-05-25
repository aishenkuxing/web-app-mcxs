package com.cn.website.mcxs.service;

import java.util.List;

import com.cn.website.mcxs.bean.GoodsInfo;

public interface GoodInfoService {
	
	public GoodsInfo getGoodInfo(long goodId);
	
	public List<GoodsInfo> getGoodInfo(String name);

	long saveGoodInfo(GoodsInfo goodInfo);
}
