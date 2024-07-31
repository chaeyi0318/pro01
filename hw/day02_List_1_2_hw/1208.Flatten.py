import sys
sys.stdin = open('input.txt')

T = 10

for test_case in range(1, T + 1):
    N = int(input())
    arr = list(map(int, input().split()))

    for i in range(N):
        max_value = max(arr)
        min_value = min(arr)

        max_idx = arr.index(max_value)
        min_idx = arr.index(min_value)

        arr[max_idx] -= 1
        arr[min_idx] += 1

    result = max(arr) - min(arr)
    print(f'#{test_case} {result}')
