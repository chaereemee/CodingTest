T = int(input())

for test_case in range(1, T+1):
    N = int(input())

    turn = ""
    if (N-1) % 2 != 0:
        turn = "Alice"
    else:
        turn = "Bob"

    print("#{} {}".format(test_case, turn))