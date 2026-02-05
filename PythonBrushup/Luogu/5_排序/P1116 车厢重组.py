# 题目链接：https://www.luogu.com.cn/problem/P1116

import sys

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    arr = list(map(int, data[1:1+n]))
    
    ans = 0
    # 冒泡排序计数（微优化版）
    for i in range(n):
        for j in range(n - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
                ans += 1
    print(ans)

if __name__ == "__main__":
    main()
