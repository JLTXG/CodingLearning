package com.ajun.houserent.service;

import com.ajun.houserent.domain.House;

public class HouseService {
    private House[] houses; //保存House对象
    private int houseNums = 1;
    private int idCounter = 1;
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

    //add方法，添加新对象，返回boolean
    public boolean add(House newHouse) {
        if (houseNums == houses.length) {
            System.out.println("数组已满，不能再添加了......");
            return false;
        }
        houses[houseNums++] = newHouse;
        newHouse.setId(++idCounter);
        return true;
    }

    //del方法，删除一个房屋信息
    public boolean del(int delId) {
        int index = -1;
        for(int i = 0; i < houseNums; i++) {
            if(delId == houses[i].getId()) {//要删除的房屋(id),是数组下标为i的元素
                index = i;//就使用index记录i
            }
        }

        if(index == -1) {//说明delId在数组中不存在(有点绕..)
            return false;
        }

        for(int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i+1];
        }
        //把当有存在的房屋信息的最后一个 设置null
        houses[--houseNums] = null;
        return true;
    }
}
