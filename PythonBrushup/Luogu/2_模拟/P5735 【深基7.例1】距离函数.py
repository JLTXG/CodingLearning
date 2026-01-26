# 题目链接：https://www.luogu.com.cn/problem/P5735

import math

x1, y1 = map(float, input().split())
x2, y2 = map(float, input().split())
x3, y3 = map(float, input().split())

d1 = math.hypot(x1 - x2, y1 - y2)
d2 = math.hypot(x2 - x3, y2 - y3)
d3 = math.hypot(x1 - x3, y1 - y3)

result = d1 + d2 + d3

print("{:.2f}".format(result))
