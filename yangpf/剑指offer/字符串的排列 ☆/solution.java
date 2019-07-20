import java.util.ArrayList;
import java.util.Collections;
public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res=new ArrayList<String>();
        if(str==null||str.length()==0)    return res;
        boolean[] visit=new boolean[str.length()];
        StringBuilder sb=new StringBuilder();
        DFS(res,str,sb,visit);
        Collections.sort(res);
        return res;
    }
    public void DFS(ArrayList<String> res,String str,StringBuilder sb,boolean[] visit){
        if(sb.length()==str.length()){
            if(!res.contains(sb.toString())){
                res.add(sb.toString());
            }
            return;
        }
        for(int i=0;i<str.length();i++){
            if(visit[i]==false){
                //sb.append(String.valueOf(str.charAt(i)));
                sb.append(str.charAt(i));
                visit[i]=true;
                DFS(res,str,sb,visit);
                sb.deleteCharAt(sb.length()-1);
                visit[i]=false;
            }
        }
    }
}