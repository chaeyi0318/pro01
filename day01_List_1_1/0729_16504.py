# T = int(input())
#
# for test_case in range(1, T + 1):
#     N = int(input())
#
#     arr = list(map(int, input().split()))
#
#     tmp_list = []
#     for i in range(N):
#
#         cnt = 0
#
#         for j in range(1, N):
#             if arr[i] < arr[j]:
#                 cnt += 1
#
#         tmp_list.append(cnt)
#     print(tmp_list)
#
#     # for i in range(1, N):
#     #     if arr[0] > arr[i]:
#     #         cnt += 1
#     #
#     # print(f'#{test_case} {cnt}')

T = int(input())

for test_case in range(1, T + 1):
    N = int(input())

    arr = list(map(int, input().split()))

    cnt_list = []

    for i in range(N):
        cnt = 0
        tmp = 0

        for j in range(i + 1, N):
            if arr[i] > arr[j]:
                cnt += 1
        cnt_list.append(cnt)

        # if cnt

    print(f'#{test_case} {max(cnt_list)}')