import java.io.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        int date = 0, nodate = 0, weight = 0;
            
        while(n-- > 0)
        {
            String str[] = input.readLine().split(" ");
            int len = str.length;
            
            for(int i = 0;i < len; i++)
            {
                if(str[i].equals("G:"))
                    weight = 2;
                else if(str[i].equals( "M:"))
                    weight = 1;
                
                if(str[i].equals( "19") || str[i].equals("20"))
                    date += weight;
                else if(str[i].equals("1") || str[i].equals("2") || str[i].equals("3") || str[i].equals("4") || str[i].equals("5") || 
                    str[i].equals("6") || str[i].equals("7") || str[i].equals("8") || str[i].equals("9") || str[i].equals("10") || 
                    str[i].equals("11") || str[i].equals("12") || str[i].equals("13") || str[i].equals("14") || str[i].equals("15") || 
                    str[i].equals("16") || str[i].equals("17") || str[i].equals("18") || str[i].equals("21") || str[i].equals("22") || 
                    str[i].equals("23") || str[i].equals("24") || str[i].equals("25") || str[i].equals("26") || str[i].equals("27") ||
                    str[i].equals("28") || str[i].equals("29") || str[i].equals("30") 
                    )
                nodate += weight;
                
            }
        }
        
        if(date > nodate)
            System.out.println("Date");
        else
            System.out.println("No Date");
        
        
    }
}
