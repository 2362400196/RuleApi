package com.RuleApi.service;

import java.util.Map;
import java.util.List;
import com.RuleApi.entity.*;
import com.RuleApi.common.PageList;

/**
 * 业务层
 * TypechoAdsService
 * @author ads
 * @date 2022/09/06
 */
public interface TypechoAdsService {

    /**
     * [新增]
     **/
    int insert(TypechoAds typechoAds);

    /**
     * [批量新增]
     **/
    int batchInsert(List<TypechoAds> list);

    /**
     * [更新]
     **/
    int update(TypechoAds typechoAds);

    /**
     * [删除]
     **/
    int delete(Object key);

    /**
     * [批量删除]
     **/
    int batchDelete(List<Object> keys);

    /**
     * [主键查询]
     **/
    TypechoAds selectByKey(Object key);

    /**
     * [条件查询]
     **/
    List<TypechoAds> selectList (TypechoAds typechoAds);

    /**
     * [分页条件查询]
     **/
    PageList<TypechoAds> selectPage (TypechoAds typechoAds, Integer page, Integer pageSize);

    /**
     * [总量查询]
     **/
    int total(TypechoAds typechoAds);
}
