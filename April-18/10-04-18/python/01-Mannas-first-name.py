for _ in range(int(input())):
    data = input()
    cnt1 = data.count("SUVOJIT")
    cnt2 = data.count("SUVO")
    print("SUVO =",cnt2-cnt1,end = ", ")
    print("SUVOJIT =",cnt1)
