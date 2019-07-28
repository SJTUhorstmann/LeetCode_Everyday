class Solution {
    public String alphabetBoardPath(String target) {
        char[][] board=new char[6][5];
        StringBuilder sb=new StringBuilder();
        int preX=0,preY=0;
        for(int i=0;i<target.length();i++){
            char ch=target.charAt(i);
            if(preX==5 && preY==0){
                int x=(ch-'a')/5;
                int y=(ch-'a')%5;
                int offsetX=x-preX;
                int offsetY=y-preY;
                preX=x;
                preY=y;
                if(offsetX<0){
                while(offsetX++<0){
                    sb.append('U');
                }
                }else if(offsetX>0){
                    while(x-->0){
                        sb.append('D');
                    }
                }
                if(offsetY<0){
                    while(offsetY++<0){
                        sb.append('L');
                    }
                }else if(offsetY>0){
                    while(offsetY-->0){
                        sb.append('R');
                    }
                }
                sb.append('!');
                continue;
            }
            int x=(ch-'a')/5;
            int y=(ch-'a')%5;
            int offsetX=x-preX;
            int offsetY=y-preY;
            preX=x;
            preY=y;
            if(offsetY<0){
                while(offsetY++<0){
                    sb.append('L');
                }
            }else if(offsetY>0){
                while(offsetY-->0){
                    sb.append('R');
                }
            }
            if(offsetX<0){
                while(offsetX++<0){
                    sb.append('U');
                }
            }else if(offsetX>0){
                while(offsetX-->0){
                    sb.append('D');
                }
            }
            sb.append('!');
        }
        return sb.toString();
    }
}