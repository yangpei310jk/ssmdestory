package com.zx.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/6/28.
 */
@Controller
@RequestMapping("book")
public class BookAction {

    public void ceshi(){
        System.out.print("快看，好大一只耗子");
    }

}
