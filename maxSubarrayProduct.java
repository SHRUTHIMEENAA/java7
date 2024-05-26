package leetprblms;
import java.util.Scanner;
public class maxSubarrayProduct {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		int maximumProd=nums[0];
		int currentProd=nums[0];
		for(int i=1;i<n;i++) {
			currentProd=Math.max(nums[i],nums[i]*currentProd);
			maximumProd=Math.max(maximumProd, currentProd);
		}
		System.out.print(maximumProd);
		
	}

}

