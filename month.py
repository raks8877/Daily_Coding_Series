import datetime

now = datetime.datetime.now()

def getMonth():
    month = now.strftime("%m")
    if(month == "01"):
        return "Jan"
    elif(month == "02"):
        return "Feb"
    elif(month == "03"):
        return "Mar"
    elif(month == "04"):
        return "April"
    elif(month == "05"):
        return "May"
    elif(month == "06"):
        return "June"
    elif(month == "07"):
        return "July"
    elif(month == "08"):
        return "Aug"
    elif(month == "09"):
        return "Sept"
    elif(month == "10"):
        return "Oct"
    elif(month == "11"):
        return "Nov"
    elif(month == "12"):
        return "Dec"

def getYear():
    year = now.strftime("%y")
    return year

def getDate():
    date = now.strftime("%d-%m-%y")
    return date
