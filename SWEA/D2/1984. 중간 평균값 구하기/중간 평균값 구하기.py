T = int(input())

for test_case in range(1, T+1):
    li = list(map(int, input().split()))
    sum = 0
    for i in range(len(li)):
        if (li[i] != max(li)) & (li[i] != min(li)):
            sum += li[i]
    print("#{} {}".format(test_case, round(sum / (len(li)-2))))