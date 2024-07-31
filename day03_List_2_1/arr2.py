# arr1 = [0] * 3
#
# arr2 = [[0] * 3 for _ in range(2)]  # [[0, 0, 0], [0, 0, 0]]
# # print(arr1)     # == print(*arr1)
#
# for i in range(len(arr2)):
#     for j in range(len(arr2[i])):
#         print(arr2[i][j], end=' ')
#     print()
#
# arr = [[1, 2, 3], [4, 5, 6]]
#
# ex_arr = [[0] * 3] * 2  # 사용 X
# ex_arr[0][0] = 1 하면 값이 [0][0], [1][0] 둘 다 들어감
# 실제로는 [0, 0, 0]을 두개 복사해서 만든거라

arr4 = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

# max_value = 0
#
# for i in range(len(arr4)):
#     sum_value = 0
#
#     for j in range(len(arr4[i])):
#         sum_value += arr4[i][j]
#
#     if max_value < sum_value:
#         max_value = sum_value
#
# print(max_value)

# 열 우선 순회
print('열 우선 순회')
for j in range(len(arr4[0])):
    for i in range(len(arr4)):
        print(arr4[i][j], end=' ')
    print()

# 지그재그 순회
print('지그재그 순회')
for i in range(len(arr4)):
    for j in range(len(arr4[i])):
        print(arr4[i][j + (len(arr4[i]) - 1 - 2 * j) * (i % 2)], end=' ')
    print()

di = [0, 1, 0, -1]
dj = [1, 0, -1, 0]

arr5 = [[0, 1, 2, 3], [5, 6, 7, 8]]

for i in range(len(arr5)):
    for j in range(len(arr5[i])):
        pass

# 전치행렬
# i, j 크기에 따라 접근하는 원소 비교 / 교재 확인하기
print('전치 행렬')
for i in range(len(arr4)):
    for j in range(len(arr4[i])):
        if i < j:
            arr4[i][j], arr4[j][i] = arr4[j][i], arr4[i][j]
        print(arr4[i][j], end=' ')
    print()

# 부분 집합을 생성하는 방법
print('부분 집합 생성')
arr = [3, 6, 7, 1, 5, 4]
n = len(arr)

for i in range(i << n):
    for j in range(n):
        if i & (i << j):
            print(arr[j], end=', ')
    print()
print()
