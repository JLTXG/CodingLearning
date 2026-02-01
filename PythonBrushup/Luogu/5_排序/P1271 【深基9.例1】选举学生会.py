# 题目链接：https://www.luogu.com.cn/problem/P1271

n, m = map(int, input().split())
arr_list = list(map(int, input().split()))
arr_list.sort()
for i in arr_list:
    print(i, end=' ')
