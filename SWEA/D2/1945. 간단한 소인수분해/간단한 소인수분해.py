T = int(input())

for test_case in range(1, T+1):
    arr = [2, 3, 5, 7, 11]
    b = [0, 0, 0, 0, 0]
    num = int(input())
    for i in range(len(arr)):
        count = 0
        while(num%arr[i]==0):
            num = num // arr[i]
            count += 1
        b[i] = count
    print("#{} {} {} {} {} {}".format(test_case, b[0], b[1], b[2], b[3], b[4]))
