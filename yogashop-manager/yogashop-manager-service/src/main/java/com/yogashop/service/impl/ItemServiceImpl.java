package com.yogashop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yogashop.mapper.TbItemMapper;
import com.yogashop.pojo.TbItem;
import com.yogashop.pojo.TbItemExample;
import com.yogashop.pojo.TbItemExample.Criteria;
import com.yogashop.service.ItemService;

/**
 * 商品管理Service
 */
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;
	
	@Override
	public TbItem getItemById(long itemId) {
		//添加查询条件
		TbItemExample example = new TbItemExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(itemId);
		List<TbItem> list = itemMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			TbItem item = list.get(0);
			return item;
		}
		
		return null;
	}

}
