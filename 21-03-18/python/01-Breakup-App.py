date = 0
nodate = 0
weight = 0
for _ in range( int(input()) ):
    
    for i in input().split(' '):
        if(i == "G:"):
            weight = 2
        elif(i == "M:"):
            weight = 1
        
        if(i == "19" or i == "20"):
            date += weight
        elif(i == "1" or i == "2" or i == "3" or i == "4" or i == "5" or
            i == "6" or i == "7" or i == "8" or i == "9" or i == "20" or
            i == "11" or i == "12" or i == "13" or i == "14" or i == "15" or
            i == "16" or i == "17" or i == "18" or 
            i == "21" or i == "22" or i == "23" or i == "24" or i == "25" or
            i == "26" or i == "27" or i == "28" or i == "29" or i == "30" 
            ):
                nodate += weight

if(date > nodate):
    print("Date")
else:
    print("No Date")
            
