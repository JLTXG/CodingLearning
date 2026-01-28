# 题目链接：https://www.luogu.com.cn/problem/P5743

n = int(input())
result = 1
for i in range(1, n):
    result = (result + 1) * 2
print(result)
