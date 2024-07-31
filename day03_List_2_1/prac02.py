import sys

sys.stdin = open('sample_input.txt')

T = int(input())
A = [i for i in range(1, 13)]
# N = A의 부분집합 中 원소의 개수
# K = 부분집합의 합

for tc in range(1, T + 1):
    N, K = map(int, input().split())
    result = 0
    for i in range(1 << 12):
        sum_value = 0
        cnt = 0

        for j in range(12):
            if i & (1 << j):
                sum_value += A[j]
                print(A[j], end=', ')
                cnt += 1
        #         print(j, end=', ')
        # # print()
        result += 1 if cnt == N and sum_value == K else 0

    print(f'#{tc} {result}')
