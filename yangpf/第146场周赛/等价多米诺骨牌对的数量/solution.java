//暴力解法会超时
import java.util.HashMap;
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<String,Integer> map=new HashMap<>();
        int num=0;
        for(int i=0;i<dominoes.length;i++){
            if(map.containsKey(exchange(dominoes[i]))){
                map.put(exchange(dominoes[i]),map.get(exchange(dominoes[i]))+1);
            }else{
                map.put(exchange(dominoes[i]),1);
            }
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()!=1)  num+=entry.getValue()*(entry.getValue()-1)/2;
        }
        return num;
    }
    public String exchange(int[] array){
        if(array[0]>array[1])   return array[1]+":"+array[0];
        else    return array[0]+":"+array[1];
    }
}