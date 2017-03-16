package com.yogashop.common.pojo;

import java.util.List;

//用于分页处理，满足EasyUIDataGrid所需的数据格式
public class EUDataGridResult {

	private long total;
	private List<?> rows;
	
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
	
}
