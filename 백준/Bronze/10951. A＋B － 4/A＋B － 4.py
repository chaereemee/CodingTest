while True:
    try: # 변수 A, B에 값이 들어간다면, A+B를 출력한다
        A, B = map(int, input().split())
        print(A+B)
    except: # try에 대한 에러가 발생한 경우
        break