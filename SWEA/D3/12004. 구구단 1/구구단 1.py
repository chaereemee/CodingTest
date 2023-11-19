T = int(input())

for test_case in range(1, T+1):
    N = int(input())

    for i in range(1, 10):
        if N % i == 0 and N // i < 10:
            result = 'Yes'
            break
        else:
            result = "No"

    print("#{} {}".format(test_case, result))
