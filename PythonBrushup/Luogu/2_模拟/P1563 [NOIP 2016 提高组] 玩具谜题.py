# 题目链接：https://www.luogu.com.cn/problem/P1563

import sys

def main():
    data = sys.stdin.read().splitlines()
    if not data:
        return
    
    # 第一行：n, m
    n, m = map(int, data[0].split())

    # 接下来 n 行：朝向 + 职业
    directions = []
    occupations = []
    index = 1
    for i in range(n):
        parts = data[index].split()
        index += 1
        dir_val = int(parts[0])
        occ = parts[1]
        directions.append(dir_val)
        occupations.append(occ)
    
    # 当前位置
    current_pos = 0

    # 处理 m 条指令
    for _ in range(m):
        a, s = map(int, data[index].split())
        index += 1
        # 如果当前朝向等于 a, 则方向移动
        if directions[current_pos] == a:
            s = -s
        # 环形移动（处理负数取模）
        current_pos = (current_pos + s) % n
        # Python 的 % 已保证非负结果，无需 +n
    
    print(occupations[current_pos])

if __name__ == "__main__":
    main()
