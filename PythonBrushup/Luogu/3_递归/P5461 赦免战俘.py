# 题目链接：https://www.luogu.com.cn/problem/P5461

n = int(input())

# 计算最终矩阵边长
size = 1 << n

# 创建 size x size 的二维数组，初始化为 0
arr = [[0] * size for _ in range(size)]

# 初始种子：a[0][0] = 1（对应原矩阵右下角）
arr[0][0] = 1

s = 1  # 当前已构造的子矩阵边长
for _ in range(n):
    for j in range(s):
        for k in range(s):
            # 复制到右上和右下
            arr[j][k + s] = arr[j + s][k] = arr[j][k]
    # 扩大一倍
    s *= 2

# 倒序输出：从最后一行到第一行，每行从最后一列到第一列
for i in range(size - 1, -1, -1):
    for j in range(size - 1, -1, -1):
        print(arr[i][j], end=" ")
    # 换行
    print()
