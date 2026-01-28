# 题目链接：https://www.luogu.com.cn/problem/P5744

class Student:
    def __init__(self, name, age, old_score):
        self.name = name
        self.age = age
        self.old_score = old_score

n = int(input())
students = []
for i in range(n):
    data = input().split()
    name = data[0]
    age, old_score = map(int, data[1:])
    students.append(Student(name, age, old_score))

for student in students:
    name = student.name
    age = student.age + 1
    new_score = int(min(student.old_score * 1.2, 600))
    print("{} {} {}".format(name, age, new_score))
