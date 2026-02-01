# 题目链接：https://www.luogu.com.cn/problem/P1923

import sys
sys.setrecursionlimit(10000000)

def quick_select(arr, left, right, k):
    if left == right:
        return arr[left]

    # 选择 pivot（这里选 left，可以优化为随机）
    pivot = arr[left]
    i = left + 1
    j = right

    # 三路分区：[left + 1, i) < pivot, [i, j] == ?, (j, right] > pivot)]
    while i <= j:
        if arr[i] < pivot:
            i += 1
        elif arr[j] > pivot:
            j -= 1
        else:
            arr[i], arr[j] = arr[j], arr[i]
            i += 1
            j -= 1
    
    # 将 pivot 放到正确的位置
    arr[left], arr[j] = arr[j], arr[left]
    pivot_index = j

    # 计算左半部分元素的个数（< pivot 的数量）
    left_count = pivot_index - left

    if k < left_count:
        return quick_select(arr, left, pivot_index - 1, k)
    elif k == left_count:
        return arr[pivot_index]
    else:
        return quick_select(arr, pivot_index + 1, right, k - left_count - 1)

# 主程序
def main():
    data = sys.stdin.read().split()
    n, k = int(data[0]), int(data[1])
    arr = list(map(int, data[2:2 + n]))

    result = quick_select(arr, 0, n - 1, k)
    print(result)

if __name__ == "__main__":
    main()
