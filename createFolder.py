'''
python createFolder.py 

it creates different folder according to date

'''
import os 
from month import *

strData = getDate()
monthName = getMonth() + "-" + getYear()

try:
    try:
        os.makedirs(monthName)
    except Exception as e1:
        pass
    os.makedirs(monthName + "/" + strData)
    os.makedirs(monthName + "/" + strData + "/c++")
    os.makedirs(monthName + "/" + strData + "/java")
    os.makedirs(monthName + "/" + strData + "/python")
except OSError as e:
    print(e)


