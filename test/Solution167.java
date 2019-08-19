package com.test;

public class Solution167 {

    public static int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while(left<right)
        {
            int sum=numbers[left]+numbers[right];

            if(target==sum)
            {
                return new int[]{left+1,right+1};
            }
            else if(sum>target)
            {
                right--;
            }
            else {
                left++;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int numbers[]={2,7,11,15};
        twoSum(numbers,9);
    }
}
