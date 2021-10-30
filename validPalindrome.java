class Solution {
//     public boolean isPalindrome(String s) {
//         StringBuilder alphaNum = new StringBuilder();
//         for (int i = 0; i < s.length(); i++) {
//             if (Character.isLetterOrDigit(s.charAt(i))) {
//                 alphaNum.append(Character.toLowerCase(s.charAt(i)));
//             }
//         }
        
//         String refinedString = alphaNum.toString();
//         String reversedRefStr = alphaNum.reverse().toString();
//         return refinedString.equals(reversedRefStr);  
//     }
    
    // Time Complexity O(N)
    // Space Complexity O(N)
    public boolean isPalindrome(String s) {
        for(int i = 0, j = s.length() - 1; i < j; i++, j--) {
            while(i < j && !(Character.isLetterOrDigit(s.charAt(i)))) {
                i++;
            }
            
            while(i < j && !(Character.isLetterOrDigit(s.charAt(j)))) {
                j--;
            }
            if(Character.toLowerCase(s.charAt(i)) != (Character.toLowerCase(s.charAt(j)))) {
                return false;
            }
        }
        return true;
    }
    
    // Time Complexity O(N)
    // Space Complexity O(1)
}