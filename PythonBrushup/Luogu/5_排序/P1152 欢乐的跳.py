# 题目链接：https://www.luogu.com.cn/problem/P1152

arr = list(map(int, input().split()))
brr = []
flag = 1
for i in range(1, len(arr) - 1):
    brr.append(abs(arr[i + 1] - arr[i]))
brr.sort()
for i in range(1, brr[0]):
    if brr[i] != i:
        flag = 0

if flag == 0:
    print("Not jolly")
else:
    print("Jolly")
