package com.cn.website.mcxs.service;

import java.util.List;

import com.cn.website.mcxs.bean.GoodInfo;

public interface GoodInfoService {
	
	public GoodInfo getGoodInfo(long goodId);
	
	public List<GoodInfo> getGoodInfo(String name);

	long saveGoodInfo(GoodInfo goodInfo);
}
