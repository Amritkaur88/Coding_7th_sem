package DAY2;

import java.util.*;
public class SubArraySumEqualsK{
    public static int sumequals(int arr[],int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k)
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int ans=sumequals(arr,k);
        System.out.println(ans);
    }
}