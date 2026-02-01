// 题目链接：https://www.luogu.com.cn/problem/P1923

#include <iostream>
#include <cstdio> // 快速读入输出头文件
#include <vector> // 动态数组头文件
using namespace std;

long long n, k; // 有自定义函数，使用全局变量
long long a[5000005];

void dfs(long long l, long long r) // 自定义函数
{
	if (l > r) // 如果 l > r
	{
		return; //  直接返回
	}
	long long num = a[l];
    // 随便选一个数，为了写代码方便就选第 1 个数
	vector <long long> minn, maxn;
    // 存储比这个数大或小的数的数组，因为大小未知，所以使用动态数组
	for (long long i = l + 1; i <= r; ++i) // 遍历这一段区间
	{
		if (a[i] < num) // 将数字存入数组
		{
			minn.push_back(a[i]);
		}
		else
		{
			maxn.push_back(a[i]);
		}
	}
	for (long long i = l; i < l + minn.size(); ++i) 
	{
		a[i] = minn[i - l];
	}
    // 改变数组中数的位置，使得数组分为三部分：比 num 小的数，num 本身，和比 num 大的数
    // 注意 for 循环的范围
	a[l + minn.size()] = num;
	for (long long i = l + minn.size() + 1; i <= r; ++i)
	{
		a[i] = maxn[i - l - minn.size() - 1];
	}
	if (k < minn.size() + 1) // 分类讨论，答案在左半边
	{ 
		dfs(l, l + minn.size() - 1); // 递归
	}
	else if (k == minn.size() + 1) // 答案正好是 num
	{
		printf("%lld", num); // 输出答案，注意使用 printf 更快
		exit(0); // 直接退出程序
	}
	else // 答案在右半边
	{ 
		k -= minn.size() + 1; // 改变 k 的值
		dfs(l + minn.size() + 1, r); // 递归
	}
}

int main()
{
	scanf("%lld %lld", &n, &k); // 输入，注意使用 scanf 更快
	for (long long i = 1; i <= n; ++i)
	{
		scanf("%lld", &a[i]);
	}
	k += 1; // 题目说最小的数是第 0 小
	dfs(1, n); // 搜索并递归
	
	return 0; // 完结撒花！！！！！
}
