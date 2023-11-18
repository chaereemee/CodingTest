T = int(input())

for test_case in range(1, T+1):
    str = input()
    alpha = "abcdefghijklmnopqrstuvwxyz"

    cnt = 0
    for i in range(len(str)):
        if str[i] == alpha[i]:
            cnt += 1
        else:
            break

    print("#{} {}".format(test_case, cnt))
