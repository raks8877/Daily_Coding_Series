#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int date = 0, nodate = 0,weight = 0 ;
    string str;
    while(cin >> str)
    {
        if(str == "G:")
            weight = 2;
        else if(str == "M:")
            weight = 1;
        if(str == "19" || str == "20")
            date += weight;
        else if(str == "1" || str == "2" || str == "3" || str == "4" || str == "5" || 
                str == "6" || str == "7" || str == "8" || str == "9" || str == "10" || 
                str == "11" || str == "12" || str == "13" || str == "14" || str == "15" || 
                str == "16" || str == "17" || str == "18" || str == "21" || str == "22" || 
                str == "23" || str == "24" || str == "25" || str == "26" || str == "27" ||
                str == "28" || str == "29" || str == "30" 
                )
            nodate += weight;
    }
    if(date > nodate)
        cout << "Date\n";
    else
        cout << "No Date\n";
}
