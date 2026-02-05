# 题目链接：https://www.luogu.com.cn/problem/P1104

n = int(input())
arr = []
for index in range(n):
    tmp = input().split()
    arr.append((tmp[0], int(tmp[1]), int(tmp[2]), int(tmp[3]), index))
arr.sort(key=lambda x: (x[1], x[2], x[3], -x[4]))
for person in arr:
    print(person[0])
