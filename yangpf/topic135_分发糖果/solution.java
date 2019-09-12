//暴力解法
class Solution {
    public int candy(int[] ratings) {
        int[] candy=new int[ratings.length];
        Arrays.fill(candy,1);
        boolean flag=true;
        while(flag){
            flag=false;
            for(int i=0;i<candy.length;i++){
                if(i>0 && ratings[i]>ratings[i-1] && candy[i]<=candy[i-1]){
                    candy[i]=candy[i-1]+1;
                    flag=true;
                }
                if(i<candy.length-1 && ratings[i]>ratings[i+1] && candy[i]<=candy[i+1]){
                    candy[i]=candy[i+1]+1;
                    flag=true;
                }
            }
        }
        int sum=0;
        for(int i=0;i<candy.length;i++){
            sum+=candy[i];
        }
        return sum;
    }
}


//两个数组
class Solution {
    public int candy(int[] ratings) {
        int[] arr1=new int[ratings.length];
        int[] arr2=new int[ratings.length];
        Arrays.fill(arr1,1);
        Arrays.fill(arr2,1);
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]){
                arr1[i]=arr1[i-1]+1;
            }
        }
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                arr2[i]=arr2[i+1]+1;
            }
        }
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            sum+=Math.max(arr1[i],arr2[i]);
        }
        return sum;
    }
}