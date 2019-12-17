class Solution {
    public int repeatedNTimes(int[] A) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:A){
            if(set.contains(i)){
                return i;
            }
            set.add(i);
        }
        return -1;
    }
}