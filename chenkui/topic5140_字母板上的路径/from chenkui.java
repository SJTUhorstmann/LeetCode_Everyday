class Solution {

    public String alphabetBoardPath(String target) {
        StringBuilder sb=new StringBuilder();
        int row0=0;
        int col0=0;

        for(int i=0;i<target.length();i++){
            char ch=target.charAt(i);
            int tem=ch-'a';
            int row1=tem/5;
            int col1=tem%5;
            
            if(row1==5){
                while(col0>col1){
                    sb.append("L");
                    col0--;
                }
                while(row0<row1){
                    sb.append("D");
                    row0++;
                }
            }
            
            while(row0<row1){
                sb.append("D");
                row0++;
            }
            while(row0>row1){
                sb.append("U");
                row0--;
            }
            while(col0<col1){
                sb.append("R");
                col0++;
            }
            while(col0>col1){
                sb.append("L");
                col0--;
            }
            
            if((col0==col1) && (row0==row1)){
                sb.append("!");
            }
            
            
        }

        return sb.toString();
    }
}