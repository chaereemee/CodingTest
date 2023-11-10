T = int(input())

for test_case in range(1, T+1):
    li = list(map(int, input().split(' ')))
    x1 = 2*li[1] - li[0]- li[2]
    x2 = (li[0] + li[2]) / 2 - li[1]
    print("#{} {:.1f}".format(test_case, min(abs(x1), abs(x2))))