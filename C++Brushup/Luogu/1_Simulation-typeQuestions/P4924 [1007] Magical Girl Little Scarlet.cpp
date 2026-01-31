#include <bits/stdc++.h>
using namespace std;

const int MAXN = 510;
int g[MAXN][MAXN];      // 原矩阵
int temp[MAXN][MAXN];   // 临时矩阵（全局复用，避免重复分配）

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int n, m;
    cin >> n >> m;
    
    // 初始化：按行优先填充 1 到 n*n
    int val = 1;
    for (int i = 1; i <= n; ++i) {
        for (int j = 1; j <= n; ++j) {
            g[i][j] = val++;
        }
    }
    
    while (m--) {
        int a, b, r, opt;
        cin >> a >> b >> r >> opt;
        
        // 计算子矩阵边界（以(a,b)为中心，半径为r）
        int row_start = a - r, row_end = a + r;
        int col_start = b - r, col_end = b + r;
        
        if (opt == 0) {
            // 顺时针 90 度：点(i,j) 映射到 (a-b+j, a+b-i)
            // 即：第i行第j列 -> 倒数第i列第j行（相对子矩阵）
            for (int i = row_start; i <= row_end; ++i) {
                for (int j = col_start; j <= col_end; ++j) {
                    temp[a - b + j][a + b - i] = g[i][j];
                }
            }
        } else {
            // 逆时针 90 度：点(i,j) 映射到 (a+b-j, b-a+i)
            // 即：第i行第j列 -> 第i列倒数第j行（相对子矩阵）
            for (int i = row_start; i <= row_end; ++i) {
                for (int j = col_start; j <= col_end; ++j) {
                    temp[a + b - j][b - a + i] = g[i][j];
                }
            }
        }
        
        // 将旋转后的结果复制回原矩阵
        for (int i = row_start; i <= row_end; ++i) {
            for (int j = col_start; j <= col_end; ++j) {
                g[i][j] = temp[i][j];
            }
        }
    }
    
    // 输出结果
    for (int i = 1; i <= n; ++i) {
        for (int j = 1; j <= n; ++j) {
            cout << g[i][j] << (j == n ? '\n' : ' ');
        }
    }
    
    return 0;
}