T = int(input())

for test_case in range(1, T+1):
    N = int(input())
    cnt = 0

    for x in range(-N, N+1):
        for y in range(-N, N+1):
            if pow(x,2) + pow(y,2) <= pow(N,2):
                cnt += 1

    print("#{} {}".format(test_case, cnt))