package com.leyou.item.service;

import com.leyou.item.pojo.Item;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author ren.xm
 * @create 2019-08-25 10:30
 */
@Service
public class ItemService {

    public Item saveItem(Item item){
        //商品新增
        int id = new Random().nextInt(100);
        item.setId(id);
        return item;
    }
}
