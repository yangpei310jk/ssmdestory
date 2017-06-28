package com.zx.dao;

import com.zx.pojo.Item;

import java.util.List;

public interface ItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Item record);

    int insertSelective(Item record);

    Item selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);

    List<Item> selectItemCat(Item item);

    int selectItemCatCount(Item item);

    int deleteItemById(List<String> idList);

    List<Item> selectItemWhere(Item item);
}