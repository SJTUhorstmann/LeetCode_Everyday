class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> indexOfnums = new HashSet<>();
        for(int num:nums){
            indexOfnums.add(num);
        }
        return indexOfnums.size()<nums.length;
    }
}