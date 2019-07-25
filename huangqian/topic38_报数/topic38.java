public String countAndSay(int n) {
        if(n==1) {
            return "1";
        } else {
            StringBuilder ans = new StringBuilder();
            int times = 1;
            String before = countAndSay (n - 1);
            char start = before.charAt(0);
            for(int i=1; i<before.length();i++){
                char temp = before.charAt(i);
                if(start==temp){
                    times++;
                }else {
                    ans.append(times).append(start);
                    start=before.charAt(i);
                    times=1;
                }
            }
            ans.append(times).append(start);
            return ans.toString();
     }      
    }