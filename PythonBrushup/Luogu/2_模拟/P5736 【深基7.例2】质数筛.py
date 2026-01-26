# 题目链接：https://www.luogu.com.cn/problem/P5736

# 质数
def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

n = int(input())
arr = list(map(int, input().split()))
result = []

for i in arr:
    if is_prime(i):
        result.append(i)

for prime in result:
    print(prime, end=' ')
