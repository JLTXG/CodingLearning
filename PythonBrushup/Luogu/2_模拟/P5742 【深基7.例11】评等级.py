# 题目链接：https://www.luogu.com.cn/problem/P5742

import math

class Student:
    def __init__(self, number, grade_one, grade_two):
        self.number = number
        self.grade_one = grade_one
        self.grade_two = grade_two
    
    def total(self):
        return self.grade_one + self.grade_two

    def is_excellent(self):
        return self.total() > 140 and self.grade_one * 7 + self.grade_two * 3 >= 800

n = int(input())
students = []
for i in range(n):
    data = input().split()
    x, y, z = map(int, data)
    students.append(Student(x, y, z))

for student in students:
    if student.is_excellent():
        print("Excellent")
    else:
        print("Not excellent")
