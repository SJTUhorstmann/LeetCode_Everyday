class Solution {
    public String originalDigits(String s) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        char[] chars=new char[]{'z','x','s','v','u','r','w','h','i','o'};
        String[] strs=new String[]{"zero","six","seven","five","four","three","two","eight","nine","one"};
        int[] nums=new int[]{0,6,7,5,4,3,2,8,9,1};
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<chars.length;i++){
            if(arr[chars[i]-'a']!=0){
                int num=arr[chars[i]-'a'];
                for(int j=0;j<strs[i].length();j++){
                    arr[strs[i].charAt(j)-'a']-=num;
                }
                while (num-->0){
                    res.add(nums[i]);
                }
            }
        }
        Collections.sort(res);
        StringBuilder sb=new StringBuilder();
        for(Integer it:res){
            sb.append(it);
        }
        return sb.toString();
    }
}