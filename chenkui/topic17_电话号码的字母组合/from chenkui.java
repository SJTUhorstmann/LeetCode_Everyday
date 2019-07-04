class Solution {
    
    private static String[] phoneLetters = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterComboHelper(String prefix, String digits)
    {
        List<String> results = new ArrayList<>();
        int digit = Character.getNumericValue(digits.charAt(0));
        String letters = phoneLetters[digit];
        for(int i = 0; i < letters.length(); i++)
        {
            if(digits.length() == 1)
                results.add(prefix + letters.charAt(i));
            else
                results.addAll(letterComboHelper(prefix + letters.charAt(i), digits.substring(1)));
        }
        return results;
    }
  
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
            return new ArrayList<>();
        return letterComboHelper("",digits);
    }
    
}