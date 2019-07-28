class Solution {
    public String alphabetBoardPath(String target) {
        char[][] board=new char[6][5];
        StringBuilder sb=new StringBuilder();
        int preX=0,preY=0;
        for(int i=0;i<target.length();i++){
            char ch=target.charAt(i);
            int x=(ch-'a')/5;
            int y=(ch-'a')%5;
            int offsetX=x-preX;
            int offsetY=y-preY;
            if(preX==5 && preY==0){
                while(offsetX++<0){
                    sb.append('U');
                }
                while(offsetY-->0){
                    sb.append('R');
                }
            }else{
                while(offsetY<0){
                    offsetY++;
                    sb.append('L');
                }
                while(offsetY>0){
                    offsetY--;
                    sb.append('R');
                }
                while(offsetX<0){
                    offsetX++;
                    sb.append('U');
                }
                while(offsetX>0){
                    offsetX--;
                    sb.append('D');
                }
            }
            preX=x;
            preY=y;
            sb.append('!');
        }
        return sb.toString();
    }
}