package application;

public class Arrayz {



//    Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
//    firstLast6([1, 2, 6]) → true
//    firstLast6([6, 1, 2, 3]) → true
//    firstLast6([13, 6, 1, 2, 3]) → false

    public static boolean firstLast6() {
        int[] nums = {1,2,3,4,5,6};
        return ((nums[0]==6) || (nums[nums.length-1]==6));
    }


//    Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
//        sameFirstLast([1, 2, 3]) → false
//    sameFirstLast([1, 2, 3, 1]) → true
//    sameFirstLast([1, 2, 1]) → true


    public static boolean sameFirstLast() {
        int[] nums = {1,2,4,5,2};
        if ((nums[0]==nums[nums.length-1]) && (nums.length>=1)){
            return true;
        }
        else {
            return false;
        }
    }


//    Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
//    makePi() → [3, 1, 4]
    public static int[] makePi() {
    return new int[] {3,1,4};
}




    }
