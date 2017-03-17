package com.yogashop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yogashop.mapper.TbItemCatMapper;
import com.yogashop.pojo.TbItemCat;
import com.yogashop.pojo.TbItemCatExample;
import com.yogashop.pojo.TbItemCatExample.Criteria;
import com.yogashop.service.ItemCatService;

/**
 * 商品分类管理
 */

@Service
public class ItemCatServiceImpl implements ItemCatService {

	@Autowired
	private TbItemCatMapper itemCatMapper;
	
	@Override
	public List<TbItemCat> getItemCatList(Long parentId) throws Exception {
		
		TbItemCatExample example = new TbItemCatExample();
		//设置查询条件
		Criteria criteria = example.createCriteria();
		//根据parentid查询子节点
		criteria.andParentIdEqualTo(parentId);
		//返回子节点列表
		List<TbItemCat> list = itemCatMapper.selectByExample(example);
		return list;
	}

}
