package com.ltt.mapper;

import java.util.List;

import com.ltt.beans.Category;

public interface CategoryMapper {

	/**
	 * 获取分类
	 * @param chnId
	 * @return
	 */
	List<Category> listByChannelId(int chnId);
	

}
