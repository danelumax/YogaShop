package com.yogashop.service;

import java.util.List;

import com.yogashop.pojo.TbItemCat;

public interface ItemCatService {

	List<TbItemCat> getItemCatList(Long parentId) throws Exception;
}
