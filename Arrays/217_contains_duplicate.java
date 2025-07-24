// https://leetcode.com/problems/contains-duplicate/description/
import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // create a HashSet to store unique elements
        HashSet<Integer> exist = new HashSet<>();
        // traverse through each element in the array
        for(int num : nums){
            //if the element already exists in the set , it is a duplicate
            if(exist.contains(num)){
                return true;
            }
            //otherwise add element to the set
            exist.add(num); 
        }
        //if no duplicates found retirn false
        return false;
    }
}
// Driver class to check the containsDuplicates
class Main {
    public static void main(String[] args){
        Solution sol = new Solution();
        // test case:1
        int[] test1 = {1, 2, 3, 4};
        //test case: 2
        int[] test2 = {1, 2, 3, 1};

        System.out.println("Test1 (no duplicates): " + sol.containsDuplicate(test1)); // false
        System.out.println("Test2 (has duplicates): " + sol.containsDuplicate(test2)); // true

    }
}


