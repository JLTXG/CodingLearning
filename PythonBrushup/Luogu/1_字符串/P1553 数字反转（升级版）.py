# 题目链接：https://www.luogu.com.cn/problem/P1553

def reverse_str(s: str) -> str:
    """
    反转字符串并去除前导零，若结果为空则返回 '0'
    """
    s = s[::-1].lstrip('0')
    return s if s else '0'

def delete_tail_zeros(s: str) -> str:
    """
    去除字符串末尾的零，若结果为空则返回 '0'
    """
    s = s.rstrip('0')
    return s if s else '0'

def main():
    s = input().strip()

    if s.endswith('%'):
        # 百分数：反转前面的数字部分
        num_part = s[:-1]
        print(reverse_str(num_part) + '%')
        return

    if '/' in s:
        # 分数：分别反转分子和分母
        left, right = s.split('/', 1)
        print(f"{reverse_str(left)}/{reverse_str(right)}")
        return
    
    if '.' in s:
        # 小数：整数部分反转，小数部分反转后去掉后导零
        left, right = s.split('.', 1)
        rev_left = reverse_str(left)
        rev_right = delete_tail_zeros(reverse_str(right))
        print(f"{rev_left}.{rev_right}")
        return
    
    # 普通整数
    print(reverse_str(s))

if __name__ == '__main__':
    main()