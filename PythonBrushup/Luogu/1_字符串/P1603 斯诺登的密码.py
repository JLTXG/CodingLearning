import sys

# 正规数字：下标即数值（num[1] = "one" → 1）
num = ["", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"]

# 非正规数字
unum = ["a", "both", "another", "first", "second", "third"]
unnum = [1, 2, 1, 1, 2, 3]

# 存储平方后的数字
a = []

# 读取输入直到遇到“.”
for line in sys.stdin:
    words = line.split()
    for s in words:
        if s == ".":
            break
        # 检查是否是正规数字
        found = False
        for i in range(1, 21):
            if s == num[i]:
                a.append(i * i)
                found = True
                break
        if not found:
            # 检查是否是非正规数字
            for i in range(len(unum)):
                if s == unum[i]:
                    a.append(unnum[i] * unnum[i])
                    break
    else:
        continue
    # 遇到 '.' 后跳出外层循环
    break

# 排序
a.sort()

# 输出处理
first = True
has_output = False
for x in a:
    mod = x % 100
    if first:
        # 注意：即使 mod == 0，如果是第一个也输出（但题目中平方 >= 1，所以 mod == 0 仅当 x == 100, 400...）
        if mod != 0 or has_output:
            print(mod, end="")
            has_output = True
            first = False
        # 如果 mod == 0 且是第一个，其实不会发生（因为最小平方是1），但为安全保留逻辑
    else:
        print(f"{mod:02d}", end="")

if not has_output:
    print("0")
else:
    print()  # 输出换行符