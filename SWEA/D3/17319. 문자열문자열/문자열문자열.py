T = int(input())

for test_case in range(1, T + 1):
    N = int(input())
    S = input()

    if N % 2 != 0:
        answer = "No"
    else:
        if S[:N//2] == S[N//2:]:
            answer = "Yes"
        else:
            answer = "No"
    print("#{} {}".format(test_case, answer))