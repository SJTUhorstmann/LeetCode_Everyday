    public int firstUniqChar(String s) {
        //�ҵ���һ�����ظ����ַ�����������
        for (int i=0;i<s.length();i++){
            int sbs=s.charAt(i);
            if(s.indexOf(sbs)==s.lastIndexOf(sbs)) return i;
        }
        return -1;
    }