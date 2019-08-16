class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int[] arr=new int[2];
        int i=0,j=n-1;
        while(i<j){
            if(numbers[i]>target-numbers[j]){
                j--;
            }else if(numbers[i]<target-numbers[j]){
                i++;
            }else{
                arr[0]=i+1;
                arr[1]=j+1;
                return arr;
            }
        }
        return arr;
    }
}