for _ in range(int(input())):
    data = input()
    n = int(data)
    if(n % 21 == 0):
        print("The streak is broken!")
    else:
        if(data.count("21")):
            print("The streak is broken!")
        else:
            print("The streak lives still in our heart!")
