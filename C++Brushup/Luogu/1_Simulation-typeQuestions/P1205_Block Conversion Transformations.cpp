// 原题链接：https://www.luogu.com.cn/problem/P1205

#include<bits/stdc++.h>

using namespace std;
int n;
char _stat[15][15], old[15][15], now[15][15], _end[15][15];

// 初始化矩阵、操作的原矩阵、操作的新矩阵和目标矩阵
// 注意，操作时用old矩阵和now矩阵，不能改变_stat矩阵

// 输入函数
void in() {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cin >> _stat[i][j];
        }
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cin >> _end[i][j];
        }
    }
}

// 初始化函数
void f() {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            now[i][j] = old[i][j] = _stat[i][j];
        }
    }
}

// 判断操作后的新矩阵与目标矩阵是否符合
bool check() {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (now[i][j] != _end[i][j]) return false;
        }
    }
    return true;
}

// 顺时针旋转90°
void turn90() {
    for (int i = 0, k = n - 1; i < n; i++, k--) {
        for (int j = 0; j < n; j++) {
            now[j][k] = old[i][j];
        }
    }
    // 更新原矩阵
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            old[i][j] = now[i][j];
        }
    }
}

// 左右翻转
void revers() {
    for (int i = 0; i < n; i++) {
        for (int j = 0, k = n - 1; j <= k; j++, k--) {
            now[i][j] = old[i][k];
            now[i][k] = old[i][j];
        }
    }
    // 更新原矩阵
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            old[i][j] = now[i][j];
        }
    }
}

// 顺时针旋转180°
void turn180() {
    turn90();
    turn90();
}

// 顺时针旋转270°
void turn270() {
    turn180();
    turn90();
}

// 组合方法
bool comb() {
    // 先反转
    revers();
    // 选择转90°的情况
    turn90();
    // 判断与目标矩阵是否符合
    if (check()) {
        return true;
    }
    // 初始化
    f();

    revers();
    // 选择转180°的情况
    turn180();
    if (check()) {
        return true;
    }
    // 初始化
    f();

    revers();
    // 选择转270°的情况
    turn270();
    if (check()) {
        return true;
    }
    f();

    // 如果都不行就返回false
    return false;
}

int main() {

    cin >> n;
    in();
    // 初始化
    f();
    // 方法1是否可行
    turn90();
    if (check()) {
        cout << 1;
        return 0;
    }
    // 每次使用完方法后都要初始化！一定注意！
    f();

    // 方法2是否可行
    turn180();
    if (check()) {
        cout << 2;
        return 0;
    }
    f();

    // 方法3是否可行
    turn270();
    if (check()) {
        cout << 3;
        return 0;
    }
    f();

    // 方法4是否可行
    revers();
    if (check()) {
        cout << 4;
        return 0;
    }
    f();

    // 方法5是否可行
    if (comb()) {
        cout << 5;
        return 0;
    }
    f();

    // 不改变原矩阵，直接check()
    if (check()) {
        cout << 6;
        return 0;
    }

    // 前6种方法都不行就输出7
    cout << 7;
    
    return 0;
}