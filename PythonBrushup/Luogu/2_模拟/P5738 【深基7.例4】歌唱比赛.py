# 题目链接：https://www.luogu.com.cn/problem/P5738

n, m = map(int, input().split())
arr, result = [], -float("inf")

for _ in range(n):
    arr.append(list(map(float, input().split())))

for i in range(n):
    arr[i].remove(max(arr[i]))
    arr[i].remove(min(arr[i]))
    result = max(result, sum(arr[i]) / (m - 2))

print(f"{result:.2f}")
