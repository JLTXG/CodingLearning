# 题目链接：https://www.luogu.com.cn/problem/P5143

n = int(input())
arr = [tuple(map(int, input().split())) for _ in range(n)]

arr.sort(key=lambda x: x[2])
result = 0
for i in range(n - 1):
    result += ((arr[i][0] - arr[i + 1][0]) ** 2 + (arr[i][1] - arr[i + 1][1]) ** 2 + (arr[i][2] - arr[i + 1][2]) ** 2) ** 0.5
print(round(result, 3))
