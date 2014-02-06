package com.weijie.oa.base;

import java.util.List;

public interface BaseDao<T> {
	/**
	 * 保存实体
	 */
	void save(T entity);
	/**
	 * 更新实体
	 */
	void update(T entity);
	/**
	 * 删除实体
	 */
	void delete(Long id);
	/**
	 * 查询实体
	 * @param id
	 * @return
	 */
	T getById(Long id);
	/**
	 * 查询实体
	 * @param ids
	 * @return
	 */
	List<T> getByIds(Long[] ids);
	/**
	 * 查询所有
	 * @return
	 */
	List<T> getAll();
}
