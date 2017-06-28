package com.zx.service;

import com.zx.dao.ItemMapper;
import com.zx.pojo.Item;
import com.zx.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/2.
 */
@Service
public class ItemServiceImpl implements ItemService{
    @Autowired
    private ItemMapper itemMapper;

    @Override
    public List<Item> selectItemWhere(Item item) {
        return itemMapper.selectItemWhere(item);
    }

    @Override
    public long updateItem(Item item) {
        long i = itemMapper.updateByPrimaryKeySelective(item);
        return i;
    }

    @Override
    public int saveItem(Item item) {
        int i=itemMapper.insertSelective(item);
        return i;
    }

    @Override
    public Boolean deleteItem(HttpServletRequest request, String strId) {
        String[] split = strId.split(",");
        List<String> idList=new ArrayList();
        for (int i=0;i<split.length;i++){
            idList.add(split[i].trim());
        }
        try {
            int c = itemMapper.deleteItemById(idList);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public PageUtil selectItemCat(Item item) {
        PageUtil rePage=new PageUtil();
        int i=itemMapper.selectItemCatCount(item);
        List<Item> list=itemMapper.selectItemCat(item);
        rePage.setList(list);
        rePage.setTotalCount(i);
        return rePage;
    }
}
