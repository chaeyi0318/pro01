T = int(input())

for test_case in range(1, T + 1):
    N = int(input())

    arr = list(map(int, input()))

    max_num = arr[0]
    cnt = 0

    for i in range(N):
        tmp = 0

        for j in range(N):
            if arr[i] == arr[j]:
                tmp += 1

        if tmp > cnt:
            max_num = arr[i]
            cnt = tmp

    print(f'#{test_case} {max_num} {cnt}')

