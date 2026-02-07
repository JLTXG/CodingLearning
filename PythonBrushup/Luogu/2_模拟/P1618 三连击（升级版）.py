# 题目链接：https://www.luogu.com.cn/problem/P1618

x = [0] * 10  # x[1]~x[9]为当前位置的数字 先把三个三位数合成一个9(10)位数的大数组
used = [False] * 10  # used数组表示该数字的使用情况 避免重复
ans = False  # ans判断是否有答案
a, b, c = 0, 0, 0

def cons(m):  # 将数组拆分成三个三位数
    sum_val = 0
    for i in range(3 * m - 2, 3 * m + 1):
        sum_val *= 10
        sum_val += x[i]
    return sum_val

def solve(n):
    global ans, x, used, a, b, c
    if n == 10 and cons(1) * b == cons(2) * a and cons(1) * c == cons(3) * a:
        # 当n=10时x数组数字存满 开始判断
        print(cons(1), cons(2), cons(3))
        ans = True
        return
    for i in range(1, 10):
        if not used[i]:
            x[n] = i  # 存数字
            used[i] = True  # 该数字被使用
            solve(n + 1)  # 下一位继续调用
            used[i] = False  # 恢复
    return

# 主程序
a, b, c = map(int, input().split())
solve(1)  # 开始搜索
if not ans:
    print("No!!!")  # ans!=true即输出"No!!!"
