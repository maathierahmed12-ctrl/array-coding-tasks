public class task6 {

        public static void main(String[] args) {

        }
        public static Integer[] task6(Integer[]nums){

            for (int i = 0; i < nums.length - 3; i++) {
                if (nums[i] == 2 && nums[i+1] == 3) {
                    nums[2] = 0;
                }
            }
            return nums;

        }

        }
}
