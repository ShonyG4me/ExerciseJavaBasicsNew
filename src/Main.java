import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/* 1/ Develop a program that takes the weight (in kilograms) and height (in meters)
              as input and calculates the BMI, then prints it.
              • Input: Weight (kg) = 70, Height (m) = 1.75
              • Expected Output: BMI = 22.86 .*/

        int weight = 70;
        double hight = 1.75;

        System.out.println( "Your IBM:" + (weight/ ((hight)*(hight)) ));

//-------------------------------------------------------
/*     2/  Write a program that takes the obtained marks and total marks as input and
            calculates the percentage, then prints it.
             • Input: Obtained Marks = 85, Total Marks = 100
             • Expected Output: Percentage = 85.0% */

        int totalMark= 100;

        Scanner input = new Scanner (System.in);

        System.out.println("enter your obtainedMark:");
        double  obtainedMark = input.nextDouble();

         System.out.println((obtainedMark / totalMark) * 100 +"%");

//-------------------------------------------------------
/*      3/ Create a program that takes an amount in one currency and an exchange rate
as input, then converts and prints the amount in another currency.
• Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
• Expected Output: Amount in EUR = 85.0  */

        Scanner exchangeRate = new Scanner (System.in);

        System.out.println("enter amount in USD:");
        double amount = exchangeRate.nextDouble();

        System.out.println("enter exchange rate");
        double rate = exchangeRate.nextDouble();

        double result = amount*rate;

        System.out.println("Amount in EUR is :" + result);


        //-------------------------------------------------------
/*   4/ Create a program that takes a string as input, calculates its length, and then
reverses the string using the StringBuilder class, finally printing both the length and
reversed string.
• Input: "Hello, World!"
• Expected Output: Length of the string: 13 And Reversed string: "!dlroW
,olleH" */

        Scanner yourText = new Scanner (System.in);

        System.out.println("Please enter your Text:");
        String text = yourText.nextLine();

        StringBuilder reversedText = new StringBuilder(text);
        reversedText.reverse();

        System.out.println("Length of your text is: " + text.length());
        System.out.println("Reversed string is: " + reversedText);


        //-------------------------------------------------------
/*   5/Develop a program that takes a sentence as input and extracts a substring from
it, then prints the extracted substring.
• Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index
= 10, End Index = 20
• Expected Output: "brown fox" */
        Scanner input2= new Scanner (System.in);

        System.out.println("Enter a sentence:");
        String text2 = input2.nextLine();

        System.out.println("Enter a Start index:");
        int index1 = input2.nextInt();

        System.out.println("Enter a End index:");
        int index2 = input2.nextInt();

        System.out.println("here the extracted substring");
        System.out.println(text2.substring (index1, index2));



        //-------------------------------------------------------
/*   6/ Write a program that takes a sentence and a keyword as input, then check if
the keyword is present in the sentence and prints the result.
• Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword =
"jumps"
• Expected Output: Keyword "jumps" is present in the sentence. */
        Scanner input3 = new Scanner(System.in);

        System.out.println("enter sentence:");
        String sentence = input3.nextLine();

        System.out.println("Enter keyword:");
        String keyword = input3.nextLine();

        System.out.println(sentence.contains(keyword));


        //-------------------------------------------------------
/*  7/ Develop a program that takes a sentence and a word to replace as input, then
replace all occurrences of the word with another word and prints the modified sentence.
• Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to Replace = "fox", Replacement Word = "cat"
• Expected Output: "The quick brown cat jumps over the lazy dog"  */

        Scanner input4 = new Scanner (System.in);

        System.out.println("Enter sentence:");
        String sentence4 = input4.nextLine();

        System.out.println("Enter word to replace here:");
        String oldWord = input4.nextLine();

        System.out.println("Enter replacement word here:");
        String newWord = input4.nextLine();

        String finalResult = sentence.replace(oldWord, newWord);

        System.out.println(finalResult);


        //-------------------------------------------------------
/*  8/ Write a program that takes two strings as input and check if they are equal,
ignoring the case, then prints whether they are equal or not.
• Input: String 1 = "Hello", String 2 = "hello"
• Expected Output: Strings are equal (ignoring case) */

        Scanner input5 = new Scanner(System.in);

        System.out.println("Enter first word:");
        String word1 = input5.nextLine();

        System.out.println("Enter second word:");
        String word2 = input5.nextLine();

        System.out.println("Words are equal " +word1.equalsIgnoreCase(word2));
    }
}