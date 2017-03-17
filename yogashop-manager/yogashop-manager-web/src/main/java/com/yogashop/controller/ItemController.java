package com.yogashop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yogashop.common.pojo.EUDataGridResult;
import com.yogashop.common.pojo.YogaResult;
import com.yogashop.pojo.TbItem;
import com.yogashop.service.ItemService;

/**
 * 商品管理Controller
 */

@Controller
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	private ItemService itemSevice;
	
	@RequestMapping("/{itemId}")
	@ResponseBody
	public TbItem getItem(@PathVariable Long itemId) {
		TbItem tbItem = itemSevice.getItemById(itemId);
		return tbItem;
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public EUDataGridResult getItemList(Integer page, Integer rows) {
		EUDataGridResult result = itemSevice.getItemList(page, rows);
		return result;
	}
	
	@RequestMapping(value="save", method=RequestMethod.POST)
	@ResponseBody
	private YogaResult createItem(TbItem item, String desc, String itemParams) throws Exception {
		YogaResult result = itemSevice.createItem(item, desc, itemParams);
		return result;
	}
	

}
