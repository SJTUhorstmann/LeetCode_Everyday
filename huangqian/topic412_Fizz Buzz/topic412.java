class Solution {
    public List<String> fizzBuzz(int n) {
        String str1 = "Fizz";
        String str2 = "Buzz";
        String str3 = "FizzBuzz";
        List<String> resList = new ArrayList();
        
        for(int i = 1;i<=n; i++){
            if(i%3==0&&i%5!=0) resList.add(str1);
            if(i%5==0&&i%3!=0) resList.add(str2);
            if(i%15==0) resList.add(str3);
            if(i%3!=0&&i%5!=0) resList.add(String.valueOf(i));
        }   
        return resList;
    }
}