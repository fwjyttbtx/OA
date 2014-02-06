package com.weijie.oa.base;

import java.util.List;

public interface BaseDao<T> {
	/**
	 * ����ʵ��
	 */
	void save(T entity);
	/**
	 * ����ʵ��
	 */
	void update(T entity);
	/**
	 * ɾ��ʵ��
	 */
	void delete(Long id);
	/**
	 * ��ѯʵ��
	 * @param id
	 * @return
	 */
	T getById(Long id);
	/**
	 * ��ѯʵ��
	 * @param ids
	 * @return
	 */
	List<T> getByIds(Long[] ids);
	/**
	 * ��ѯ����
	 * @return
	 */
	List<T> getAll();
}
