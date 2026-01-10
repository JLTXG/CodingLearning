[712. 两个字符串的最小ASCII删除和 - 力扣（LeetCode）](https://leetcode.cn/problems/minimum-ascii-delete-sum-for-two-strings/description/?envType=daily-question&envId=2026-01-10)

>标签：字符串  |  动态规划

# 一、题目描述

给定两个字符串`s1` 和 `s2`，返回 *使两个字符串相等所需删除字符的 **ASCII** 值的最小和* 。

 

**示例 1:**

```
输入: s1 = "sea", s2 = "eat"
输出: 231
解释: 在 "sea" 中删除 "s" 并将 "s" 的值(115)加入总和。
在 "eat" 中删除 "t" 并将 116 加入总和。
结束时，两个字符串相等，115 + 116 = 231 就是符合条件的最小和。
```

**示例 2:**

```
输入: s1 = "delete", s2 = "leet"
输出: 403
解释: 在 "delete" 中删除 "dee" 字符串变成 "let"，
将 100[d]+101[e]+101[e] 加入总和。在 "leet" 中删除 "e" 将 101[e] 加入总和。
结束时，两个字符串都等于 "let"，结果即为 100+101+101+101 = 403 。
如果改为将两个字符串转换为 "lee" 或 "eet"，我们会得到 433 或 417 的结果，比答案更大。
```

 

**提示:**

- `0 <= s1.length, s2.length <= 1000`
- `s1` 和 `s2` 由小写英文字母组成



# 二、解题思路\解题过程

这道题的题意很好理解，就是为了保证最长子序列的同时，需要返回被剔除的字符的ASCII值的和，同时，返回的ASCII值还必须得是最小的，所以，这道题其实和[1143. 最长公共子序列 - 力扣（LeetCode）](https://leetcode.cn/problems/longest-common-subsequence/description/)这道题很像，方法是一样的，只需要改变部分代码即可，所以，先去把[1143. 最长公共子序列 - 力扣（LeetCode）](https://leetcode.cn/problems/longest-common-subsequence/description/)这道题完成，后续再来完成本道题！

本道题的思路如下：
![1143_最长公共子序列_动规五步曲思路](E:\NoteTakingSoftwares\Typora\Images\1143_最长公共子序列_动规五步曲思路.jpg)
上述图片是下面这道题[1143. 最长公共子序列 - 力扣（LeetCode）](https://leetcode.cn/problems/longest-common-subsequence/description/)的思路，很明显的可以看到，力扣第1143求得是最长的公共子序列，本题（力扣第712道题目)求得是除去公共公共最长子序列，返回删除的最小的字符ASCII值的总和，所以只需要将两个字符串的所有字符ASCII值的总和`total`减去`2 * 最长公共子序列的ASCII值的总和`即可！

代码如下：
```python
class Solution:
    def minimumDeleteSum(self, s1: str, s2: str) -> int:
        n, m, total = len(s1), len(s2), sum(map(ord, s1)) + sum(map(ord, s2))
        dp = [[0] * (m + 1) for _ in range(n + 1)]
        for i, a in enumerate(s1):
            for j, b in enumerate(s2):
                if a == b :
                    dp[i + 1][j + 1] = dp[i][j] + ord(a)
                else :
                    dp[i + 1][j + 1] = dp[i + 1][j] if dp[i + 1][j] > dp[i][j + 1] else dp[i][j + 1]
        return total - dp[n][m] * 2
```

【注】：
上述Python代码的相关知识：
1、`enumerate()` —— 带索引的遍历

```python
for index, value in enumerate(iterable, start=0): 
...
```
- `iterable`：可迭代对象（如字符串、列表、元组等）
- `start`：索引起始值（默认为 0）
- 返回一个 **枚举对象**，每次迭代产出 `(index, value)` 元组

2、`ord()` —— 获取字符的 Unicode 码点（ASCII 是其子集）
```python
ord(c)  # c 必须是长度为 1 的字符串
```
- 返回该字符对应的 **Unicode 码点**（整数）
- 对于 ASCII 字符（如 `'A'`, `'0'`, `' '`），返回的就是传统 ASCII 值

其他语言的代码：
```cpp
class Solution {
public:
    int minimumDeleteSum(string s1, string s2) {
        int n = s1.length(), m = s2.length();
        // 计算两个字符串的 ASCII 总和
        int total = 0;
        for (auto c : s1) total += c;
        for (auto c : s2) total += c;
        
        vector<vector<int>> dp(n + 1, vector<int>(m + 1));
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(s1[i] == s2[j]){
                    dp[i + 1][j + 1] = dp[i][j] + s1[i];
                } else {
                    dp[i + 1][j + 1] = dp[i + 1][j] > dp[i][j + 1] ? dp[i + 1][j] : dp[i][j + 1];
                }
            }
        }
        return total - 2 * dp[n][m];
    }
};
```



# 三、代码演示

## Java代码

```Java
class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        // 计算两个字符串的 ASCII 总和
        int total = 0;
        for (char c : s1.toCharArray()) total += c;
        for (char c : s2.toCharArray()) total += c;
        
        int[][] dp = new int[n + 1][m + 1];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    dp[i + 1][j + 1] = dp[i][j] + s1.charAt(i);
                } else {
                    dp[i + 1][j + 1] = dp[i + 1][j] > dp[i][j + 1] ? dp[i + 1][j] : dp[i][j + 1];
                }
            }
        }
        return total - 2 * dp[n][m];
    }
}
```



## Python代码

```Python
class Solution:
    def minimumDeleteSum(self, s1: str, s2: str) -> int:
        n, m, total = len(s1), len(s2), sum(map(ord, s1)) + sum(map(ord, s2))
        dp = [[0] * (m + 1) for _ in range(n + 1)]
        for i, a in enumerate(s1):
            for j, b in enumerate(s2):
                if a == b :
                    dp[i + 1][j + 1] = dp[i][j] + ord(a)
                else :
                    dp[i + 1][j + 1] = dp[i + 1][j] if dp[i + 1][j] > dp[i][j + 1] else dp[i][j + 1]
        return total - dp[n][m] * 2
```



## C++代码

```C++
class Solution {
public:
    int minimumDeleteSum(string s1, string s2) {
        int n = s1.length(), m = s2.length();
        // 计算两个字符串的 ASCII 总和
        int total = 0;
        for (auto c : s1) total += c;
        for (auto c : s2) total += c;
        
        vector<vector<int>> dp(n + 1, vector<int>(m + 1));
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(s1[i] == s2[j]){
                    dp[i + 1][j + 1] = dp[i][j] + s1[i];
                } else {
                    dp[i + 1][j + 1] = dp[i + 1][j] > dp[i][j + 1] ? dp[i + 1][j] : dp[i][j + 1];
                }
            }
        }
        return total - 2 * dp[n][m];
    }
};
```

