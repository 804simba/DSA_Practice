package com.simba.algos;

public class Main {
    public static void main(String[] args) {
        int[] answer = searchRange(new int[]{5,7,7,8,8,10}, 8);
        System.out.println(answer);
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];

        result[0] = getFirst(nums, target);
        result[1] = getLast(nums, target);
        return result;
    }

    public static int getFirst(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > target)
                end = mid - 1;
            else if (nums[mid] < target)
                start = mid + 1;
            else {
                index = mid;
                end = mid - 1;
            }
        }
        return index;
    }

    public static int getLast(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target)
                end = mid - 1;
            else if (nums[mid] < target)
                start = mid + 1;
            else {
                index = mid;
                start = mid + 1;
            }
        }
        return index;
    }
}

