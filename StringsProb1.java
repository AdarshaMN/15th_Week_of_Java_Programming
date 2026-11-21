package StringProblems;

public class StringsProb1 {
    
    public static void main(String[] args)
    {
        demo1();
        demo2();
        demo3();
        demo4();
        demo5();
        demo6();
        demoGetAToB();
        demoGetBToA();
        demoGetAToSmallA();
        demoGetaToSmallA();
        isUpper();
    }

    public static void demo1()
    {
        char [] ch = new char[5];

        System.out.println("Defaults Values: ");
        for(int i = 0;  i < ch.length; i++)
        {
            System.out.println((int)(ch[i]));
        }
        System.out.println();
    }

    public static void demo2()
    {
        char ch[] = {'a', 'b', 'c', 'd'};

        System.out.println("Initailizations: ");

        for(int i = 0; i < ch.length; i++)
        {
            System.out.println(ch[i] + " ");
        }
        System.out.println();
    }

    public static  void demo3()
    {
        char ch[] = {'a', 'b', 'c', 'd'};

        System.out.println("Length of Char is: " + ch.length);
        System.out.println();
    }

    public static void demo4()
    {
        char[] ch = {65, 66, 67, 68};

        System.out.println("Ascii Values Char are : ");
        System.out.println(ch);
    }

    public static void demo5()
    {
        char ch[] = new char[5];

        ch[0] = 'A';
        ch[1] = 'B';

        for(int i = 0; i < ch.length; i++)
        {
            System.out.println(ch[i] + " ");
        }
        System.out.println();
    }

    public static void demo6()
    {
        String str = "Adarsha";

        System.out.println(str);
        System.out.println(str.length());
    }

    //A to B
    public static void demoGetAToB()
    {
        char ch = 'A';
        char nextChar = (char) (ch + 1);
        System.out.println(nextChar);
    }

    public static void demoGetBToA()
    {
        char ch = 'B';
        System.out.println((char) (ch - 1));
    }

    public static void demoGetAToSmallA()
    {
        char ch = 'A';
        System.out.println((char) (ch + 32));
    }

    public static void demoGetaToSmallA()
    {
        char ch = 'a';
        System.out.println((char) (ch - 32));
    }

    public static void isUpper()
    {
        char ch = 'G';

        if(ch >= 'A' && ch <= 'Z')
        {
            System.out.println(ch + " :is a UpperCase Letter");
        }
        else 
        {
            System.out.println(ch + " :is a LowerCase Letter");
        }
    }
}
