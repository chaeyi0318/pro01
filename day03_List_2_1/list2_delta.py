import sys

sys.stdin = open('ex1_input.txt')
# arr = [[1, 2, 3, 4, 5], [1, 2, 3, 4, 5], [1, 2, 3, 4, 5], [1, 2, 3, 4, 5], [1, 2, 3, 4, 5]]

T = int(input())

for tc in range(T):
    N = int(input())
    arr = [list(map(int, input().split())) for _ in range(N)]

    di = [0, 1, 0, -1]
    dj = [1, 0, -1, 0]

    total = 0

    for i in range(N):
        for j in range(N):  # N * N 배열의 모든 원소에 대해
            s = 0       # 문제에서 원소와 인접원소의 차의 합
            # i, j 원소의 네 방향 원소에 대해
            for k in range(4):
                ni = i + di[k]
                nj = j + dj[k]

                if 0 <= ni < N and 0 <= nj < N:
                    s += abs(arr[i][j] - arr[ni][nj])        # 실존하는 인접원소 ni, nj
            total += s
    print(total)