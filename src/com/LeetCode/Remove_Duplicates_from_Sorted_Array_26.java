package com.LeetCode;

public class Remove_Duplicates_from_Sorted_Array_26 {
	public static int removeDuplicates(int[] nums) {
		int i=0;
		for (int j=0;j<nums.length;j++){
			if(nums[j]!=nums[j+1]){
				nums[i]=nums[j];
				i++;
			}
			
		}
		return i;

	}
	
	
	public static void main(String args[]) {
		int a[] = { 1,1,2 };
		int b = removeDuplicates(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.print(b);

	}
}
