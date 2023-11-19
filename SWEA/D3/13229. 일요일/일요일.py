T = int(input())

for test_case in range(1, T+1):
    day = input()
    days = ["SAT", "FRI", "THU", "WED", "TUE", "MON", "SUN"]
    num = [1, 2, 3, 4, 5, 6, 7]
    
    for i in range(len(days)):
        if day == days[i]:
            print("#{} {}".format(test_case, num[i]))