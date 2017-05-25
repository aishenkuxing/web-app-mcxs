package com.cn.website.mcxs.dao;

import java.util.List;

import com.cn.website.common.dao.BaseDaoSupport;
import com.cn.website.mcxs.bean.GoodsInfo;

public interface GoodInfoDao extends BaseDaoSupport {
	public List<GoodsInfo> getGoodInfo(String name);
}
