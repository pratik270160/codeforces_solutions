import java.util.*;
public class main381A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int start=0;
        int end=n-1;
        int max=0;
        int sersum=0;
        int dimasum=0;
        int count=0;
        while(start<=end)
        {
            max=Math.max(arr[start],arr[end]);
            if(max==arr[start])
            {
                start++;
            }
            else
            {
                end--;
            }
            if(count%2==0)
            {
                sersum+=max;
            }
            else
            {
                dimasum+=max;
            }
            count++;

        }
        System.out.print(sersum +" "+ dimasum);
    }
}
