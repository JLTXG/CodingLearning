# 题目链接：https://www.luogu.com.cn/problem/P5740

class Student:
    def __init__(self, name, x, y, z, idx):
        self.name = name
        self.x = x
        self.y = y
        self.z = z
        self.idx = idx

n = int(input())
students = []
for i in range(n):
    data = input().split()
    name = data[0]
    x, y, z = map(int, data[1:])
    students.append(Student(name, x, y, z, i))

students.sort(key = lambda s: (- (s.x + s.y + s.z), s.idx))

best = students[0]
print(best.name, best.x, best.y, best.z)
