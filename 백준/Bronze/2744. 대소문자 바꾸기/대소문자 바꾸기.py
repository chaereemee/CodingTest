str = input()
new = []

for i in str:
    if i.islower():
        new.append(i.upper())
    else:
        new.append(i.lower())

for i in new:
    print(i, end='')