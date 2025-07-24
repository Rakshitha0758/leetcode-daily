// https://leetcode.com/problems/contains-duplicate/description/
import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> exist = new HashSet<>();
        for(int num : nums){
            if(exist.contains(num)){
                return true;
            }
            exist.add(num); 
        }
        return false;
    }
}
class Main {
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] test1 = {1, 2, 3, 4};
        int[] test2 = {1, 2, 3, 1};

        System.out.println("Test1 (no duplicates): " + sol.containsDuplicate(test1)); // false
        System.out.println("Test2 (has duplicates): " + sol.containsDuplicate(test2)); // true

    }
}


