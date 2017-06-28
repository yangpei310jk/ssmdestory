package com.zx.service;

import com.zx.pojo
        .Item;
import com.zx.util.PageUtil;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2017/6/2.
 */
public interface ItemService {
    PageUtil selectItemCat(Item item);

    int saveItem(Item item);

    Boolean deleteItem(HttpServletRequest request, String strId);

    long updateItem(Item item);

    List<Item> selectItemWhere(Item item);
}
