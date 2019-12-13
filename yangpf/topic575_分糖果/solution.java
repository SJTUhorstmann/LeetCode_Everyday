class Solution {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        for(int i:candies){
            if(!set.contains(i)){
                count+=1;
                set.add(i);
            }
        }
        if(count>candies.length/2)  return candies.length/2;
        return count;
    }
}