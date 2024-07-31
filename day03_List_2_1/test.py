arr = [-7, -5, 2, 3, 8, -2, 4, 6, 9]
sum_value = 0
n = 3
k = 3
cnt = 0
result = 0

for i in range(1 << len(arr)):
    for j in range(len(arr)):
        if i & (1 << j):
            # print(arr[j], end=', ')
            sum_value += arr[j]

            if sum_value == 0:
                cnt += 1
print(cnt)