package com.yogashop.service;

import com.yogashop.common.pojo.EUDataGridResult;
import com.yogashop.pojo.TbItem;

public interface ItemService {

	TbItem getItemById(long itemId);
	EUDataGridResult getItemList(int page, int row);
}
