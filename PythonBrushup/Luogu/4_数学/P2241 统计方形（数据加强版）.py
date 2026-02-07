# 题目链接：https://www.luogu.com.cn/problem/P2241

n, m = map(int, input().split())

# 确保 n <= m，方便计算
if n > m:
    n, m = m, n

# 正方形数量：sum of (n-k+1)*(m-k+1) for k in 1..n
# = sum of (n-i)*(m-i) for i in 0..n-1
sqr = 0
for i in range(n):
    sqr += (n - i) * (m - i)

# 矩形总数（包括正方形）：C(n+1,2) * C(m+1,2) = n*(n+1)/2 * m*(m+1)/2
total_rect = n * (n + 1) // 2 * m * (m + 1) // 2

# 纯矩形数量 = 总数 - 正方形数
rec = total_rect - sqr

print(sqr, rec)
