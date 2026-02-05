# 题目链接：https://www.luogu.com.cn/problem/P1068

n, m = map(int, input().split())
arr = [tuple(map(int, input().split())) for _ in range(n)]

# 正确排序：成绩降序，报名号升序
arr.sort(key=lambda x: (-x[1], x[0]))

# 计算分数线排名（第 k 名，k 从 1 开始）
k = m * 15 // 10  # 向下取整
score_line = arr[k - 1][1]  # 第 k 名的成绩（索引 k-1）

# 统计所有 >= 分数线的人数
count = 0
for score in [x[1] for x in arr]:
    if score >= score_line:
        count += 1
    else:
        break

print(score_line, count)
for i in range(count):
    print(arr[i][0], arr[i][1])
