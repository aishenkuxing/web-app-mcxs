package com.cn.website.mcxs.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cn.website.common.entity.MessageObject;
import com.cn.website.mcxs.bean.GoodsInfo;
import com.cn.website.mcxs.service.GoodInfoService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("api/mcxs/good")
public class GoodInfoController {
	
	@Autowired
	private GoodInfoService goodInfoService;
	
	@RequestMapping("getGoodInfo")
	@ApiOperation(value = "获取商品信息接口", httpMethod = "GET", notes = "获取商品信息接口",tags="0.01版本组件")
	public GoodsInfo getGoodInfo(@RequestParam long goodId){
		return goodInfoService.getGoodInfo(goodId);
	}
	
	@RequestMapping("getGoodInfoList")
	@ApiOperation(value = "获取商品信息接口", httpMethod = "GET", notes = "获取商品列表",tags="0.01版本组件")
	public MessageObject<List<GoodsInfo>> getGoodInfoList(@RequestParam String name){
		MessageObject<List<GoodsInfo>> msg = new MessageObject<List<GoodsInfo>>();
		try{
			msg.setData(goodInfoService.getGoodInfo(name));
			msg.setCode(1);
		}catch (Exception e) {
			e.printStackTrace();
			msg.setCode(-1);
			msg.setMessage(e.getMessage());
		}
		return msg;
	}
	
	@RequestMapping("saveGoodInfo")
	@ApiOperation(value = "保存商品信息接口", httpMethod = "POST", notes = "保存更新商品",tags="0.01版本组件")
	public MessageObject<Long> saveGoodInfo(@RequestBody GoodsInfo goodInfo){
		MessageObject<Long> msg = new MessageObject<Long>();
		try{
			msg.setData(goodInfoService.saveGoodInfo(goodInfo));
			msg.setCode(1);
		}catch (Exception e) {
			e.printStackTrace();
			msg.setCode(-1);
			msg.setMessage(e.getMessage());
		}
		return msg;
	}
}
