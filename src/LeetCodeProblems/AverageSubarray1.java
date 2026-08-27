package LeetCodeProblems;
 class AverageSubarray1 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++){
            sum+= nums[i];
        }
        int best = sum;

        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            best = Math.max(best, sum);
        }
        return(double) best / k;

    }
    public static  void main(String[] args) {
        AverageSubarray1 sol = new AverageSubarray1();
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double result = sol.findMaxAverage(nums, k);
        System.out.println(result);
    }
}

