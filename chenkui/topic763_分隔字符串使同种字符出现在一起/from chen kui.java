class Solution {
    public List<Integer> partitionLabels(String S) {
      int [] arr=new int[26];
      for(int i=0;i<S.length();i++){
        int index=S.charAt(i)-'a';
        arr[index]=i;
      }
      List<Integer> list= new ArrayList<Integer>();
      int begin=0;
      while(begin<S.length()){
        int end=begin;
        for(int j=0;j<S.length() && j<=end;j++){
          int index1=S.charAt(j)-'a';
          if(arr[index1]>end){
            end=arr[index1];
          }
        }
        list.add(end-begin+1);
        begin=end+1;
      }
      return list;
    }
}
