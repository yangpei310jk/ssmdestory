package com.zx.action;

import com.alibaba.fastjson.JSON;
import com.zx.pojo.Admin;
import com.zx.pojo.Item;
import com.zx.pojo.MailHistory;
import com.zx.service.ItemService;
import com.zx.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/6/2.
 */
@Controller
@RequestMapping("item")
public class ItemAction {
    @Autowired
    private ItemService itemServic;

    public void test2(){
        System.out.print("12345677777777777777777777777777777");
        System.out.print("12345677777777777777777777777777777");
        System.out.println("tttttttttttttttttt");
    }

    public void toList1() {
        System.out.println("aaaaaaaaaaaaaaaa");
    }

    public void toList2() {
        System.out.println("bbbbbbbbbbbbbbbbbb");
    }

    public void toList3() {
        System.out.println("ccccccccccccccccccccc");
    }

    public void test(){
        System.out.print("12345677777777777777777777777777777");
        System.out.print("12345677777777777777777777777777777");
        System.out.print("12345677777777777777777777777777777");
        System.out.print("12345677777777777777777777777777777");
    }
}

