# 题目链接：https://www.luogu.com.cn/problem/P5741

import math

class Student:
    def __init__(self, name, x, y, z, total):
        self.name = name
        self.x = x
        self.y = y
        self.z = z
        self.total = total

n = int(input())
students = []
for i in range(n):
    data = input().split()
    name = data[0]
    x, y, z = map(int, data[1:])
    total = x + y + z
    students.append(Student(name, x, y, z, total))

result = []
for i in range(n):
    for j in range(i + 1, n):
        if abs(students[i].x - students[j].x) <= 5 and \
           abs(students[i].y - students[j].y) <= 5 and \
           abs(students[i].z - students[j].z) <= 5 and \
           abs(students[i].total - students[j].total) <= 10:
            result.append([students[i].name, students[j].name])

for pair in result:
    print(pair[0], pair[1])
