# 题目链接：https://www.luogu.com.cn/problem/P1059

n = int(input())
arr = set(map(int, input().split()))
sorted_arr = sorted(arr)
print(len(sorted_arr))
for i in sorted_arr:
    print(i, end=' ')
