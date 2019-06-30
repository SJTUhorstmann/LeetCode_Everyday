    public int firstUniqChar(String s) {
        //找到第一个不重复的字符并返回索引
        for (int i=0;i<s.length();i++){
            int sbs=s.charAt(i);
            if(s.indexOf(sbs)==s.lastIndexOf(sbs)) return i;
        }
        return -1;
    }