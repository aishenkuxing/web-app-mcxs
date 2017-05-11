package com.cn.website.mcxs.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cn.website.mcxs.bean.GoodInfo;
import com.cn.website.mcxs.service.GoodInfoService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("api/mcxs/good")
public class GoodInfoController {
	
//	@Autowired
//	private GoodInfoService goodInfoService;
//	
//	@RequestMapping("getGoodInfo")
//	@ApiOperation(value = "获取商品信息接口", httpMethod = "GET", notes = "获取商品信息接口",tags="0.01版本组件")
//	public GoodInfo getGoodInfo(long goodId){
//		return null;
//	}
}
