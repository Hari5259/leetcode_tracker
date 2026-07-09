// Last updated: 7/9/2026, 11:36:30 AM
class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);          // Sort to bring duplicates together
        backtrack(nums, 0, new ArrayList<>());
        return result;
    }

    private void backtrack(int[] nums, int start, List<Integer> current) {

        result.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++) {

            // Skip duplicate elements at the same recursion level
            if (i > start && nums[i] == nums[i - 1])
                continue;

            current.add(nums[i]);

            backtrack(nums, i + 1, current);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}