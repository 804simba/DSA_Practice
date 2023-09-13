package com.simba.practice;

import java.util.Arrays;

public class ThreeSums {
    public static void main (String[] args) {
        int[] array = {-1, 2, 1, -4};
        int res = threeSumClosest(array, 1);
        System.out.println(res);
    }

    public static int threeSumClosest(int[] nums, int target) {
        int rL = -10000;
        int rU = 10000;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            int lowP = i + 1;
            int highP = nums.length - 1;
            while(lowP < highP){
                int sum = nums[i] + nums[lowP] + nums[highP];
                if(sum == target){
                    return sum;
                }else if(sum > target){
                    rU = Math.min(rU, sum);
                    highP--;
                }else{
                    rL = Math.max(rL, sum);
                    lowP++;
                }
            }
        }

        if(Math.abs(target - rU) < Math.abs(target - rL)){
            return rU;
        }else{
            return rL;
        }
    }
}
