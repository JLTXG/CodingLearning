# 题目链接：https://www.luogu.com.cn/problem/P5737

def is_leap_year(year):
    if year % 400 == 0 or (year % 4 == 0 and year % 100 != 0):
        return True
    else:
        return False

start_year, end_year = map(int, input().split())

count, result = 0, []

for i in range(start_year, end_year + 1):
    if is_leap_year(i):
        count += 1
        result.append(i)

print(count)
for i in result:
    print(i, end=" ")
