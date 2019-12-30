//创建了一个二维数组，宽为字符串数组A的长度，长为26，表示26个字母
//arr[i][j]表示第i个字符串含有字符'a'+j的个数
//执行用时 :8 ms, 在所有 java 提交中击败了36.86%的用户
//内存消耗 :38 MB, 在所有 java 提交中击败了90.55%的用户
class Solution {
    public List<String> commonChars(String[] A) {
        List<String> res=new ArrayList<>();
        int[][] arr=new int[A.length][26];
        for(int i=0;i<A.length;i++){
            String str=A[i];
            for(int j=0;j<str.length();j++){
                arr[i][str.charAt(j)-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            int num=arr[0][i];
            if(num==0)  continue;
            boolean flag=true;
            for(int j=1;j<A.length;j++){
                if(arr[j][i]==0){
                    flag=false;
                    break;
                }
                num=Math.min(num,arr[j][i]);
            }
            if(flag){
                while(num>0){
                    char ch=(char)('a'+i);
                    res.add(String.valueOf(ch));
                    num--;
                }
            }
        }
        return res;
    }
}