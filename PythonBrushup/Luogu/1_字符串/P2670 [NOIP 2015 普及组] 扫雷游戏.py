# 题目链接：https://www.luogu.com.cn/problem/P2670

n, m = map(int, input().split())
grid = []
for i in range(n):
    row = list(input().strip())
    grid.append(row)

for i in range(n):
    tmp = []
    for j in range(m):
        count = 0
        if grid[i][j] == "*":
            tmp.append("*")
            continue
        if i > 0 and j > 0 and grid[i - 1][j - 1] == "*":
            count += 1
        if i > 0 and grid[i - 1][j] == "*":
            count += 1
        if i > 0 and j < m - 1 and grid[i - 1][j + 1] == "*":
            count += 1
        if j > 0 and grid[i][j - 1] == "*":
            count += 1
        if j < m - 1 and grid[i][j + 1] == "*":
            count += 1
        if i < n - 1 and j > 0 and grid[i + 1][j - 1] == "*":
            count += 1
        if i < n - 1 and grid[i + 1][j] == "*":
            count += 1
        if i < n - 1 and j < m - 1 and grid[i + 1][j + 1] == "*":
            count += 1
        tmp.append(str(count))
    print("".join(tmp))
