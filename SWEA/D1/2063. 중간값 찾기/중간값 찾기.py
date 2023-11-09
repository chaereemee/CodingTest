N = int(input())

scores = list(map(int, input().split(' ')))
scores.sort()
# 중간값은 (총 길이 / 2 + 1) 인데, 배열은 0부터 시작이니 + 1 안해도 됨
score = scores[N//2]
print(score)