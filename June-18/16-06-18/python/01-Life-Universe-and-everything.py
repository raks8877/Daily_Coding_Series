from sys import stdin

for data in stdin:
    data = int(data)
    if(data == 42):
        break
    else:
        print(data)
