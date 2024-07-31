# k = input()
# data = [0, 4, 1, 3, 1, 2, 4]  # 0부터 k까지
# counts = [0] * (k + 1)
# tmp = []
#
# for i in range(0, len(data)):
#     counts[data[i]] += 1
#
# for i in range(k + 1):
#     counts[i] += counts[i - 1]
#
# for i in range(len(tmp) - 1, -1, -1):
#     counts[data[i]] -= 1
#     tmp[counts[data[i]]] = data[i]

data = [0, 4, 1, 3, 1, 2, 4, 1]
counts = [0] * 5    # data가 0 ~ 4까지의 정수인 경우
n = len(data)   # data의 크기
tmp = [0] * n   # 정렬 결과 저장할 list

# 1단계 : data 원소 별 개수 구하기
# data의 원소 x를 가져와서  counts[x]에 개수 기록
for x in data:
    counts[x] += 1

# 2단계 : 각 숫자까지의 누적 개수 구하기
for i in range(1, 5):   # counts[0] ~ counts[4]까지 누적
    counts[i] += counts[i - 1]

# 3단계 : data의 맨 뒤부터 tmp에 정렬하기
for i in range(n - 1, -1, -1):
    counts[data[i]] -= 1   # 누적 개수 1개 감소
    idx = counts[data[i]]
    # tmp[idx] = data[i]
    tmp[idx] = data[i]

print(*tmp)
