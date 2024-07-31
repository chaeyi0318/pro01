T = int(input())

for tc in range(1, T + 1):
    N = int(input())    #숫자 갯수 받고
    arr = list(map(int, input().split()))   #숫자 받아서 리스트로
    max_v = arr[0]  #가장 큰값을 임시로 첫번쩨 원소로 지정

    for i in range(N):  # for문을 돌면서, 값을 비교하여 가장 큰 수 구함
        if max_v < arr[i]:
            max_v = arr[i]
    min_v = arr[0]
    for j in range(N):  # for문을 돌면서, 값을 비교하여 가장 작은 수 구함
        if min_v > arr[j]:
            min_v = arr[j]
    answer = int(max_v) - int(min_v)    # 구한 값의 차를 구함.
    print(f'#{tc} {answer}')    # 출력

for j in range(int(input())):  # 테스트 케이스 받으면서 반복문 작성
    N = int(input())  # 숫자갯수
    a = sorted(map(int, input().split()))  # 숫자를 받으면서 정렬해서 저장
    print(f'#{j + 1}', a[-1] - a[0])  # 양끝값 차 프린트
