//时间复杂度为N的解法，两次遍历，从左往右和从右向左
class Solution {
    public int[] shortestToChar(String S, char C) {
        int len=S.length();
        int[] arr=new int[len];
        //好好理解一下pre和post的初始赋值，为何这么赋值
        int pre=Integer.MIN_VALUE/2;
        for(int i=0;i<len;i++){
            if(S.charAt(i)==C)  pre=i;
            arr[i]=i-pre;
        }
        int post=Integer.MAX_VALUE/2;
        for(int i=len-1;i>=0;i--){
            if(S.charAt(i)==C)  post=i;
            arr[i]=Math.min(arr[i],post-i);
        }
        return arr;
    }
}

//从每个字符向两边扩散寻找字符C
class Solution {
    public int[] shortestToChar(String S, char C) {
        int len=S.length();
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            if(S.charAt(i)==C){
                arr[i]=0;
                continue;
            }  
            for(int j=1;i-j>=0 || i+j<len;j++){
                if(i-j>=0 && S.charAt(i-j)==C){
                    arr[i]=j;
                    break;
                }
                if(i+j<len && S.charAt(i+j)==C){
                    arr[i]=j;
                    break;
                }
            }
        }
        return arr;
    }
}
//使用一个list存储每个字符C所在的位置
class Solution {
    public int[] shortestToChar(String S, char C) {
        int len=S.length();
        int[] arr=new int[len];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<len;i++){
            if(S.charAt(i)==C){
                list.add(i);
            }
        }
        for(int i=0;i<len;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<list.size();j++){
                min=Math.min(min,Math.abs(list.get(j)-i));
            }
            arr[i]=min;
        }
        return arr;
    }
}