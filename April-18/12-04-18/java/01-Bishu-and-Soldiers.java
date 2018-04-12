import java.util.*;

class TestClass {
	static int BS(int ar[], int l, int r, int key)
	{
		int m = 0;
		while(l <= r)
		{
			m = l + (r-l)/2;
			if(ar[m] > key)
			{
				if(ar[m-1] <= key)
					return m - 1;
				else
					r = m - 1;
			}
			else 
			{
				l = m + 1;
			}
		}
		return m;
	}
	public static void main(String args[] ) throws Exception {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int ar[] = new int[n];
		for(int i = 0; i < n; i++)
			ar[i] = input.nextInt();
		Arrays.sort(ar);
		int dp[] = new int[n];
		dp[0] = ar[0];
		for(int i = 1; i < n; i++)
			dp[i] = dp[i-1] + ar[i];
		
		int q = input.nextInt();
		while(q-- > 0)
		{
			int x = input.nextInt();
			int pos = BS(ar, 0, n-1, x);
			System.out.println((pos+1) + " " + dp[pos]);
		}
	}
}

