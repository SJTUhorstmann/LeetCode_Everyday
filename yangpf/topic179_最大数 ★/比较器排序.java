class Solution {
    public String largestNumber(int[] nums) {
        String[] str=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            str[i]=""+nums[i];
        }
        Arrays.sort(str,new Comparator<String>(){
            //ע��Ƚ��������˳��
            public int compare(String x1,String x2){
                return (x2+x1).compareTo(x1+x2);
            }
        });
        //ע�ⲻ����str[0]=="0"
        if(str[0].equals("0"))   return "0";
        StringBuilder sb=new StringBuilder();
        for(String s:str){
            sb.append(s);
        }
        return sb.toString();
    }
}