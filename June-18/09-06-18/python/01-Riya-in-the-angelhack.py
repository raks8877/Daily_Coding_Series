n = int(input())
if(n % 3 == 0 and n % 5 == 0):
    print("AngelHack!")
elif(n % 3 == 0):
    print("Angel")
elif(n % 5 == 0):
    print("Hack")
else:
    print(n)
