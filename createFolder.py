import os 
from month import *

strData = getDate()
monthName = getMonth() + "-" + getYear()

try:
    os.makedirs(monthName)
    os.makedirs(monthName + "/" + strData)
    os.makedirs(monthName + "/" + strData + "/c++")
    os.makedirs(monthName + "/" + strData + "/java")
    os.makedirs(monthName + "/" + strData + "/python")
except OSError as e:
    print(e)


