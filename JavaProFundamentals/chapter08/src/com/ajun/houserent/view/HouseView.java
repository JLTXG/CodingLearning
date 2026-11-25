package com.ajun.houserent.view;

import com.ajun.houserent.domain.House;
import com.ajun.houserent.service.HouseService;
import com.ajun.houserent.utils.Utility;

public class HouseView {

    private boolean loop = true; //控制显示菜单
    private char key = ' '; //接收用户选择
    private HouseService houseService = new HouseService(10);

    //显示主菜单
    public void mainMenu() {

        do {
            System.out.println("\n=============房屋出租系统菜单============");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");
            System.out.print("请输入你的选择(1-6): ");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
//                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
//                    update();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
//                    exit();
                    loop = false;
                    break;
            }
        } while (loop);
    }

    //编写listHouses()显示房屋列表
    public void listHouses() {
        System.out.println("=============房屋列表============");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();//得到所有房屋信息
        for (int i = 0; i < houses.length; i++) {//大家想想，这里老韩有什么？雷,坑
            if (houses[i] == null) {//如果为null,就不用再显示了
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("=============房屋列表显示完毕============");

    }

    //编写addHouse() 接收输入，创建House对象，调用add方法
    public void addHouse() {
        System.out.println("=============添加房屋============");
        System.out.print("姓名: ");
        String name = Utility.readString(8);
        System.out.print("电话: ");
        String phone = Utility.readString(12);
        System.out.print("地址: ");
        String address = Utility.readString(16);
        System.out.print("月租: ");
        int rent = Utility.readInt();
        System.out.print("状态: ");
        String state = Utility.readString(3);
        //创建一个新的House对象, 注意id 是系统分配的，
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)) {
            System.out.println("=============添加房屋成功============");
        } else {
            System.out.println("=============添加房屋失败============");
        }
    }

    //编写delHouse() 接收输入的id,调用Service 的del方法
    public void delHouse() {
        System.out.println("=============删除房屋信息============");
        System.out.print("请输入待删除房屋的编号(-1退出):");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("=============放弃删除房屋信息============");
            return;
        }
        //注意该方法本身就有循环判断的逻辑,必须输出Y/N
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {//真的删除
            if (houseService.del(delId)) {
                System.out.println("=============删除房屋信息成功============");
            } else {
                System.out.println("=============房屋编号不存在，删除失败============");
            }
        } else {
            System.out.println("=============放弃删除房屋信息============");
        }
    }
}
