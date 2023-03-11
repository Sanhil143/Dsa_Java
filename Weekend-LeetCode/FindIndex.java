

// Find First and Last Position of Element in Sorted Array

// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a 
// given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
// Example 3:

// Input: nums = [], target = 0
// Output: [-1,-1]

import java.util.Arrays;

public class FindIndex {
      public static int[] findIndex(int nums[], int target) {
            int left = 0;
            int right = nums.length -1;
            
            int mid ;
            int leftOcc = -1;
            int rightOcc =-1;
            
            //5,7,7,8,8,10
            
            while(left <= right){
                mid = left+ (right-left)/2;
                if(nums[mid] == target)
                {
                    leftOcc = mid;
                    right = mid -1;
                }  
                
                else if(nums[mid] < target)
                {
                    left = mid+1;
                }
                
                else
                {
                    right= mid-1;
                }    
            }
            
            left = 0;
            right = nums.length -1;
                    
            mid = left+ (right-left)/2;
            
                    
            while(left <= right){
                mid = left+ (right-left)/2;
                if(nums[mid] == target)
                {
                    rightOcc = mid;
                    left = mid +1;
                }  
                
                else if(nums[mid] < target)
                {
                    left = mid+1;
                }
                
                else
                {
                    right= mid-1;
                }    
            }
           
            return new int[]{leftOcc,rightOcc };
      }
      public static void main(String args[]) {
            int nums[] = {5,7,7,8,8,10};
            int target = 8;

            int newArr[] = findIndex(nums, target);
            System.out.println(Arrays.toString(newArr));
            
      }
}