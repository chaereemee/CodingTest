numbers = [i for i in range(1, 31)]

for _ in range(28):
    students = int(input())
    numbers.remove(students) # 소거

print(min(numbers))
print(max(numbers))