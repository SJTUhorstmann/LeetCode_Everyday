    public int strStr(String haystack, String needle) {
       if(needle==null) return 0;
        //±©Á¦½â·¨
        int l1 = haystack.length();
        int l2 = needle.length();
        char[] ha = haystack.toCharArray();
        char[] ne = needle.toCharArray();
        int i=0,j=0;

        while (i<l1&&j<l2){
            if(ha[i]==ne[j]){
                i++;
                j++;
            }else {
                i=i-j+1;
                j=0;
            }
        }

        if(j==l2) return i-j;
        else return -1;
    }