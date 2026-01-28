# 题目链接：https://www.luogu.com.cn/problem/P2415

list_set = list(map(int, input().split()))
total = sum(list_set)
print(total * pow(2, len(list_set) - 1))
