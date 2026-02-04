# 题目链接：https://www.luogu.com.cn/problem/P2676

n, m = map(int, input().split())
grid, tmp = [], 0
for i in range(n):
    grid.append(int(input()))
grid.sort(reverse=True)
for i in range(n):
    tmp += grid[i]
    if tmp >= m:
        print(i + 1)
        break
