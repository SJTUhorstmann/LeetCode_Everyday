class Solution {
List<Integer> nums = new ArrayList<>();
public boolean isHappy(int n) {
    
    if(nums.contains(n)){
        return false;
    }
    nums.add(n);
    int sum = 0;
    while(n/10!=0){
        int unit = n - (n/10)*10;
        sum += (int)Math.pow(unit,2); 
        n /= 10;
    }
    sum += (int)Math.pow(n,2);
    if(sum==1){
        return true;
    }else{
        return isHappy(sum);
    }
}
}