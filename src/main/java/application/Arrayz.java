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


//    Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
//    commonEnd([1, 2, 3], [7, 3]) → true
//    commonEnd([1, 2, 3], [7, 3, 2]) → false
//    commonEnd([1, 2, 3], [1, 3]) → true

    public static boolean commonEnd() {
        int[] a = {1,2,3,4};
        int[] b = {1,7,8,9};
        return ((a[0]==b[0]) || (a[a.length-1])==b[b.length-1]);
    }

//    Given an array of ints length 3, return the sum of all the elements.
//    sum3([1, 2, 3]) → 6
//    sum3([5, 11, 2]) → 18
//    sum3([7, 0, 0]) → 7

    public static int sum3() {
        int[] nums ={5,10,15};
        return nums[0]+nums[1]+nums[2];
    }

//    Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
//    rotateLeft3([1, 2, 3]) → [2, 3, 1]
//    rotateLeft3([5, 11, 9]) → [11, 9, 5]
//    rotateLeft3([7, 0, 0]) → [0, 0, 7]

    public static int[] rotateLeft3() {
        int[] nums = {1,2,3};
        return new int[] {nums[1],nums[2],nums[0]};
    }

//    Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
//    reverse3([1, 2, 3]) → [3, 2, 1]
//    reverse3([5, 11, 9]) → [9, 11, 5]
//    reverse3([7, 0, 0]) → [0, 0, 7]

    public static int[] reverse3() {
        int[] nums = {1,2,3};
        return new int[] {nums[2],nums[1],nums[0]};
    }

//    Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
//    maxEnd3([1, 2, 3])→ [3, 3, 3]
//    maxEnd3([11, 5, 9]) → [11, 11, 11]
//    maxEnd3([2, 11, 3]) → [3, 3, 3]

    public int[] maxEnd3() {
        int[] nums = {1,2,3};
        if (nums[0] > nums[2]) {
            return new int[]{nums[0],nums[0],nums[0]};
        } else {
            return new int[] {nums[2],nums[2],nums[2]};
        }
    }

}
