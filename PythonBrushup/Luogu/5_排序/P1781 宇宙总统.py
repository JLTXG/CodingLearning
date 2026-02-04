# 题目链接：https://www.luogu.com.cn/problem/P1781

# 解法一
# n = int(input())
# arr = {}
# for i in range(1, n + 1):
#     arr[i] = int(input())

# winner = max(arr, key=arr.get)
# print(winner)
# print(arr[winner])

# 解法二
n = int(input())
arr = []
for i in range(1, n + 1):
    vec = int(input())
    arr.append((i, vec))

arr.sort(key=lambda x: x[1], reverse=True)

print(arr[0][0])
print(arr[0][1])
