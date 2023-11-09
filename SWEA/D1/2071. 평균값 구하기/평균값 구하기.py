T = int(input())
for test_case in range(1, T + 1):
    arr = list(map(int, input().split(' ')))
    sum = 0;
    avg = 0;
    for i in arr:
        sum += i
    avg = sum / len(arr)
    print("#{} {}".format(test_case, round(avg)))