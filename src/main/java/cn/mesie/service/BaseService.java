package cn.mesie.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 2018/7/15 5:23 PM
 *
 * @author: mesie
 */
@Service
public interface BaseService<T> {

    T selectByKey(Object key);

    int save(T entity);

    int delete(Object key);

    int updateAll(T entity);

    int updateNotNull(T entity);

    List<T> selectByExample(Object example);
}
