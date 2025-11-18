import java.util.Scanner;

/*
I will be blatantly stealing the structure from the book
Chapter 12 Section 12.4 "Using Recursion to Create Visual Patterns"
In that, they use a recursion method to hold 2 variables which I also used.
Spaces tracks the amount of spaces
Line is the number of lines to perform that specific string of characters for
*/
public class diamond
{
    public static void main(String[] args)
    {
        diamond d = new diamond();
        Scanner input = new Scanner(System.in);
        int size;
        System.out.println("Print the diamond? 1 = 'Yes' 0 = 'No'");
        int choice = input.nextInt();
        if (choice == 1)
        {
            d.printStyle(1, 23);   
        }
        else
        {
            System.out.println("Invalid input, please try again.");
            main(new String[0]);
        }
    }

    void printStyle(int line, int size)
    {
        if (line > size)
            return;
        
        printDiamond(line);
        printSpaces(size - line);
        System.out.println();

        printStyle(line + 1, size)
    }

    void printDiamond(int count)
    {
        if (count == 0)
            return;
        System.out.println("*");
        printDiamond(count - 1);   
    }

    void printSpaces(int count)
    {
        if (count == 0)
            return;
        System.out.print(" ");
        printSpaces(count - 1);
    } 
}