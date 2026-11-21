package StringProblems;

public class DecodeCompString1 {
    
    public static void main(String[] args) {
        
        testDecode("3a2b1c");
        testDecode("1x5y");
        testDecode("2a3n");
    }

    public static void testDecode(String input)
    {
        System.out.println("Input: " + input);
        System.out.println("Output: " + decodeWithNumbers(input));
    }

    public static String decodeWithNumbers(String input)
    {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < input.length(); i = i + 2)
        {
            //read chatr
            char currentCharacter = input.charAt(i + 1);

            //reads Digits
            int numbers = input.charAt(i) - '0';

            for(int count = 1; count <= numbers; count++)
            {
                sb.append(currentCharacter);
            }
        }
        return sb.toString();
    }
}
