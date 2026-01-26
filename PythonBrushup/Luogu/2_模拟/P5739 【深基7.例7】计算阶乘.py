# 题目链接：https://www.luogu.com.cn/problem/P5739

n = int(input())

def fac(n):
    if n == 0:
        return 1
    else:
        return n * fac(n - 1)

print(fac(n))
