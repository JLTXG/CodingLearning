# 题目链接：https://www.luogu.com.cn/problem/P1598

# 初始化计数数组（索引 0~25 对应 A~Z）
a = [0] * 26
max_num = 0

# 读取 4 行输入
for _ in range(4):
    line = input().strip()
    for char in line:
        if 'A' <= char <= 'Z':
            idx = ord(char) - ord('A')
            a[idx] += 1

# 找出最大出现次数
max_num = max(a) if a else 0

# 从上到下打印柱状图（从 max_num 到 1）
for i in range(max_num, 0, -1):
    row = []
    for j in range(26):
        if a[j] >= i:
            row.append('*')
        else:
            row.append(' ')
    print(' '.join(row))

# 打印最后一行：A, B, C, ..., Z
letters = [chr(ord('A') + i) for i in range(26)]
print(' '.join(letters))
