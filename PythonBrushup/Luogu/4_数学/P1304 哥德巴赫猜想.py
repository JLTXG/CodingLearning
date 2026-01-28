# 题目链接：https://www.luogu.com.cn/problem/P1304

def is_even_number(number):
    if number % 2 == 0:
        return True
    else:
        return False

def is_prime_number(number):
    if number == 1:
        return False
    for i in range(2, int(number**0.5) + 1):
        if number % i == 0:
            return False
    return True

n = int(input())
result = []

for i in range(4, n + 1):
    if is_even_number(i):
        for j in range(2, i):
            if is_prime_number(j) and is_prime_number(i - j):
                result.append(f"{i}={j}+{i - j}")
                break

for line in result:
    print(line)
