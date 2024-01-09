public class Main {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 2, 4, 6, 8, 9}, 4));
    }


    public static int searchInsert(int[] nums, int target) {
//        if (nums.length == 1 && nums[0] != target) {
//            return -1;
//        }
//        int div = nums.length / 2;
//        System.out.println(nums.length);
//        if (nums[div] > target) {
//            return searchInsert(Arrays.copyOfRange(nums, 0, div), target);
//        } else if (nums[div] < target) {
//            return searchInsert(Arrays.copyOfRange(nums, div + 1, nums.length), target);
//        } else {
//            return div;
//        }

        // [1, 2, 4, 6, 8, 9], len = 6
        int i = nums.length / 2;
        int j = 0;
        while (i != j) {
            if (nums[i] > target) {
                i = i / 2;
            } else if (nums[i] < target) {
                System.out.println(i);
                j = nums.length;
                i = i + (j - i) / 2;
            } else {
                return i;
            }
        }
        return i;
    }
}
