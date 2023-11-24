def num(n1, n2, n3, n4, n5):
    n6 = (pow(n1, 2) + pow(n2, 2) + pow(n3, 2) + pow(n4, 2) + pow(n5, 2))%10
    print(n6)

n1, n2, n3, n4, n5 = map(int, input().split())
num(n1, n2, n3, n4, n5)
