class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] array=new int[num_people];
        int count=1;
        int index=0;
        while(candies>0){
            array[index++%num_people]+=count;
            candies-=count;
            count++;
            if(candies<count && candies>0){
                array[index%num_people]+=candies;
                break;
            }   
        }
        return array;
    }
}