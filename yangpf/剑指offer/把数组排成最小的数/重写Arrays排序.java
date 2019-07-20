import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        String[] str=new String[numbers.length];
        for(int i=0;i<str.length;i++){
            str[i]=String.valueOf(numbers[i]);
        }
        Arrays.sort(str,new Comparator<String>(){
            @Override
            public int compare(String v1,String v2){
                return (v1+v2).compareTo(v2+v1);
            }
        });
        StringBuilder sb=new StringBuilder();
        for(String i:str){
            sb.append(i);
        }
        return sb.toString();
    }
}