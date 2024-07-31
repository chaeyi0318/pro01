T = int(input())

for test_case in range(1, T + 1):
    N, M = map(int, input().split())

    arr = list(map(int, input().split()))

    max_value = 0
    min_value = 0

    for i in range(N - M + 1):
        tmp = 0

        for j in range(i, i + M):
            tmp += arr[j]

        if tmp > max_value:
            max_value = tmp

        if min_value == 0:
            min_value = tmp
        elif tmp < min_value:
            min_value = tmp

    print(f'#{test_case} {max_value - min_value}')
