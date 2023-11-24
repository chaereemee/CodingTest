def cal(X, Y):
    result = (X+Y)*(X-Y)
    print(result)

A, B = map(int, input().split())
cal(A, B)