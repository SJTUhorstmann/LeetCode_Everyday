class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
      if(letters[letters.length-1]<=target || letters[0]>target ) return letters[0];
      int l=0;
      int h=letters.length-1;
      while(l<=h){
        int mid=l+(h-l)/2;
        if(letters[mid]>target){
          h=mid-1;
        }
        else
        {
          l=mid+1;
        }
      }
      return letters[l];
    }
}
