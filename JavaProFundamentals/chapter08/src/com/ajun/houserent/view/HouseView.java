package com.ajun.houserent.view;

import com.ajun.houserent.utils.Utility;

public class HouseView {

    private boolean loop = true; //控制显示菜单
    private char key = ' '; //接收用户选择

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
//                    addHouse();
                    break;
                case '2':
//                    findHouse();
                    break;
                case '3':
//                    delHouse();
                    break;
                case '4':
//                    update();
                    break;
                case '5':
//                    listHouses();
                    break;
                case '6':
//                    exit();
                    loop = false;
                    break;
            }
        } while (loop);
    }
}
