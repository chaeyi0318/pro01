import sys
sys.stdin = open('input.txt')

T = int(input())

for tc in range(1, T + 1):
    N, M = map(int, input().split())
    arr = [list(map(int, input().split())) for _ in range(N)]
    max_value = 0

    # 파리채 가능 공간 (N - M + 1)
    for i in range(N - M + 1):
        for j in range(N - M + 1):
            cnt_sum = 0
            for r in range(M):
                for c in range(M):
                    cnt_sum += arr[r + i][c + j]
            if cnt_sum > max_value:
                max_value = cnt_sum

    print(f'#{tc} {max_value}')