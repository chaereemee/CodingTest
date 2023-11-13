T = int(input())

for test_case in range(1, T+1):
    N, K = map(int, input().split(' '))
    cnt = N // 10
    student = []
    k_student = 0
    result = ['D0', 'C-', 'C0', 'C+', 'B-', 'B0', 'B+', 'A-', 'A0', 'A+']
    for i in range(N):
        student.append(list(map(float, input().split(' '))))
        student[i] = student[i][0] * 0.35 + student[i][1] * 0.45 + student[i][2] * 0.2
        if (i == K -1):
            k_student = student[i]
        student.sort()
    for j in range(len(student)):
        if student[j] == k_student:
            print("#{} {}".format(test_case, result[j // cnt]))