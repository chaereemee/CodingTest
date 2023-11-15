T = int(input())

for test_case in range(1, T+1):
    h, m, p1, p2 = map(int, input().split())
    hp = h + p1
    mp = m + p2
    if (mp >= 60):
        hp += mp // 60
        mp = mp % 60
    if (hp >= 13):
        hp = hp - 12
    print("#{} {} {}".format(test_case, hp, mp))