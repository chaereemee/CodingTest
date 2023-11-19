T = int(input())

for test_case in range(1, T+1):
    S = input()

    result = ""
    cnt = 0
    for i in range(len(S)):
        if S[i] == 'x':
            cnt += 1
    if cnt >= 8:
        result = "NO"
    else:
        result = "YES"

    print("#{} {}".format(test_case, result))