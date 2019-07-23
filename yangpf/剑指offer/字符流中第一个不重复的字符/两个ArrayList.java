import java.util.ArrayList;
public class Solution {
    ArrayList<Character> list1=new ArrayList<Character>();
    ArrayList<Character> list2=new ArrayList<Character>();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if(!list1.contains(ch) && !list2.contains(ch)){
            list1.add(ch);
        }else{
            if(list1.contains(ch))    list1.remove(list1.indexOf(ch));
            list2.add(ch);
        }
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        if(list1.size()==0)    return '#';
        return list1.get(0);
    }
}