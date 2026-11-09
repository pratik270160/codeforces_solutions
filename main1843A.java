import java.util.*;
public class main1843A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t>0)
        {
            int max = 0;
            int min = 0;
            int diff = 0;
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int start = 0;
            int end = n - 1;
            int maxsum = 0;
            Arrays.sort(arr);
            while(start<=end)
            {
                max=Math.max(arr[start],arr[end]);
                min= Math.min(arr[start], arr[end]);
                diff=max-min;
                maxsum+=diff;
                start++;
                end--;
            }
            t--;
            System.out.println(maxsum);
        }
    }
}
