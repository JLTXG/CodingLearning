# 题目链接：https://www.luogu.com.cn/problem/P2089

n = int(input())
kind = 0
m1 = [[0] * 10 for _ in range(10000)]
m2 = [0] * 10

def peiliao(total, a):
    global kind, m1, m2, n
    if a == 10:
        if total == n:
            for j in range(10):
                m1[kind][j] = m2[j]  # 符合要求存起来~~
            kind += 1
    elif total >= n:
        pass  # 小小优化一下
    else:
        for i in range(1, 4):
            m2[a] = i
            peiliao(total + i, a + 1)  # 其实这和十连for没什么区别。。。

peiliao(0, 0)
print(kind)
for j in range(kind):
    for i in range(10):
        print(m1[j][i], end=" ")  # 大家一定要记得打空格...
    print()
