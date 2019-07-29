 public String longestCommonPrefix(String[] strs) {
        if(strs.length==0 || strs[0].length()==0) return "";
        if(strs.length==1) return strs[0];
        String ans = "";
        boolean flag=true;
        int length = strs[0].length();
        for (String str : strs) {
            length = Math.min(length, str.length());
        }
        if (length == 0) return "";
        for (int j=0;j<length;j++) {
            for (int i = 1; i < strs.length; i++) {
                if (j < strs[0].length() && j < strs[i].length()) {
                    if (strs[0].charAt(j) != strs[i].charAt(j)) {
                        flag=false;
                        break;
                    }
                }
            }
            if(flag==true) {
                ans += strs[0].charAt(j);
            }
        }
        return ans;
    }