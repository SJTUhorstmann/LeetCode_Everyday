class Solution {
    public List<Integer> partitionLabels(String S) {
      List<Integer> res=new ArrayList<>();
        int start=0;
        while(start!=S.length()) {
            char first = S.charAt(start);
            int end = S.lastIndexOf(first);
            for (int i = start; i <= end; i++) {
                char ch = S.charAt(i);
                if (S.lastIndexOf(ch) > end) {
                    end = S.lastIndexOf(ch);
                }
            }
            res.add(end-start+1);
            start = end + 1;
        }
      return res;
    }
}