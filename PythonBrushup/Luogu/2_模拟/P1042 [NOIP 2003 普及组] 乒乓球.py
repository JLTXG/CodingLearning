# 题目链接：https://www.luogu.com.cn/problem/P1042

import sys

# 一次性读取全部输入，提取出 'W' 和 'L' 字符，直到遇到 'E' 为止
data = sys.stdin.read()
str = ''
for ch in data:
    if ch in 'WL':
        str += ch
    elif ch == 'E':
        break

def solve(k):
    a = b = 0
    for ch in str:
        if ch == 'W':
            a += 1
        elif ch == 'L':
            b += 1
        if max(a, b) >= k and abs(a - b) >= 2:
            print(f"{a}:{b}")
            a = b = 0
    print(f"{a}:{b}")
    print()

solve(11)
solve(21)
