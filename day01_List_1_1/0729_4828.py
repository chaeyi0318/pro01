T = int(input())

for test_case in range(1, T + 1):
    N = int(input())
    arr = list(map(int, input().split()))
    max_num, min_num = arr[0], arr[0]

    for i in range(1, N):
        max_num = arr[i] if max_num < arr[i] else max_num
        min_num = arr[i] if min_num > arr[i] else min_num

    print(f'#{test_case} {max_num - min_num}')