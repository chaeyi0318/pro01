T = 10

for test_case in range(1, T + 1):
    N = int(input())

    arr = list(map(int, input().split()))

    result_list = []
    result = 0

    for i in range(2, N - 2):
        l_tmp = 0
        r_tmp = 0

        if arr[i - 1] > arr[i - 2]:
            l_tmp = arr[i - 1]
        else:
            l_tmp = arr[i - 2]

        if arr[i + 1] > arr[i + 2]:
            r_tmp = arr[i + 1]
        else:
            r_tmp = arr[i + 2]

        if r_tmp > l_tmp:
            result_list.append(arr[i] - r_tmp)
        else:
            result_list.append(arr[i] - l_tmp)

    for item in result_list:
        if item > 0:
            result += item

    print(f'#{test_case} {result}')

# T = 10
#
# for test_case in range(1, T + 1):
#     N = int(input())
#     arr = list(map(int, input().split()))
#
#     result = 0
#
#     for i in range(2, N - 2):
#         max_left = max(arr[i - 2], arr[i - 1])
#         max_right = max(arr[i + 1], arr[i + 2])
#         view = arr[i] - max(max_left, max_right)
#
#         if view > 0:
#             result += view
#
#     print(f'#{test_case} {result}')