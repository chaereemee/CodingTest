import math

T = int(input())

for test_case in range(1, T+1):
    N, D = map(int, input().split())

    count = math.ceil((N / (2 * D + 1)))
    print("#{} {}".format(test_case, count))