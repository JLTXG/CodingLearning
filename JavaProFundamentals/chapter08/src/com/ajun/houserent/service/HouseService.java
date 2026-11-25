package com.ajun.houserent.service;

import com.ajun.houserent.domain.House;

public class HouseService {
    private House[] houses; //保存House对象

    //构造器
    public HouseService(int size) {
        //new houses
        houses = new House[size];//当创建HouseService对象，指定数组大小
        //为了配合测试列表信息，老韩这里初始化一个House对象
        houses[0] = new House(1,"jack","112", "海淀区", 2000, "未出租");
    }

    //list方法，返回houses
    public House[] list() {
        return houses;
    }
}
