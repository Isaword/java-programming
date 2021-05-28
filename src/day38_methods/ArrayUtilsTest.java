package day38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
     int[] nums = {5, 23, 1, 543, 90};
     ArrayUtils.printArray(nums);
     ArrayUtils.printArray(new int[] {3, 5, 7, 11, 19});

        System.out.println("sum = "+ ArrayUtils.sum(nums));
        System.out.println("sum = "+ ArrayUtils.sum(new int[] {3, 5, 7, 11, 19}));

        int[] nums2 = {4,1,5,8};
        System.out.println("5 - found = "+ArrayUtils.contains(nums2, 5));
        System.out.println("10 - found = "+ArrayUtils.contains(nums2, 10));
    }
}
