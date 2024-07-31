arr = [i for i in range(1, 13)]
N = 5
K = 15
result = 0
for i in range(1 << N):
    sum_value = 0

    for j in range(N):
        if i & (1 << j):
            print(arr[j], end=', ')
        #     sum_value += arr[j]
        #
        # if K == sum_value:
        #     result += 1
    print()
print()
# print(result)
