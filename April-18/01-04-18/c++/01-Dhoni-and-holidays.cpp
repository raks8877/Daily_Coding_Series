#include<bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int ar[n] = {0};
    
    for(int i = 0; i < n; i++)
    {
        cin >> ar[i];
    }
    
    bool car = false, acad = false;
    int cnt = 0;
    for(int i = 0; i < n; i++)
    {
        if(ar[i] == 0)
        {
            cnt += 1;
            car = acad = false;
        }
        else if(ar[i] == 1)
        {
            if(!acad)
            {
                car = false;
                acad = true;
            }
            else
            {
                cnt += 1;
                car = acad = false;
            }
        }
        else if(ar[i] == 2)
        {
            if(!car)
            {
                car = true;
                acad = false;
            }
            else
            {
                cnt += 1;
                car = acad = false;
            }
        }
        else if(ar[i] == 3)
        {
            if(!car && !acad)
            {
                car = acad = false;
            }
            else if(!car && acad)
            {
                car = true;
                acad = false;
            }
            else if(car && !acad)
            {
                car = false;
                acad = true;
            }
            
        }
        
    }
    
    cout << cnt << endl;
}
