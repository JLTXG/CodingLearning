# 题目链接：https://www.luogu.com.cn/problem/P1177

n = int(input())
arr_list = list(map(int, input().split()))
arr_list.sort()
for i in arr_list:
    print(i, end=' ')
