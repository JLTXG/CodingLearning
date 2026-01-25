# 题目链接：https://www.luogu.com.cn/problem/P1200

import sys

def main():
    comet = sys.stdin.readline().strip()
    team = sys.stdin.readline().strip()

    def calc(s):
        res = 1
        for c in s:
            res *= (ord(c) - ord("A") + 1)
        return res % 47
    
    print("GO" if calc(comet) == calc(team) else "STAY")

if __name__ == "__main__":
    main()
    