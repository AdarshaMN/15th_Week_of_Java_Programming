package StringProblems;

//Approach 2: valid clean String using String builder
//reason: avoid creating multiple String objects while cleaning.
//TC: O(n)
//SC: 

public class isPalApproachTwo {
    
    public static void main(String[] args)
    {
        testPalindrome("madam");
        testPalindrome("Madam");
        testPalindrome("12321");
        testPalindrome("A1@b#b@1a");
    }

    public static void testPalindrome(String input)
    {
        boolean ans = isPalindrome(input);

        System.out.println("Input: " + input);
        System.out.println("output: " + ans);
    }

    //Logic here 
    public static boolean isPalindrome(String input)
    {

        input = input.toLowerCase();

        //use String Builder as it has append() method to creating new String
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < input.length(); i++)
        {
            char currentChar = input.charAt(i);

            if(Character.isLetterOrDigit(currentChar))
            {
                sb.append(currentChar);
            }

        }

        //reverse
        StringBuilder reverseBuilder = new StringBuilder(sb);
        reverseBuilder.reverse();

        //compare 
        return sb.toString().equals(reverseBuilder.toString());
    }
}
