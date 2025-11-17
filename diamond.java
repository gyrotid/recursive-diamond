java.util.scanner;

/*
I will be blatantly stealing the structure from the book
Chapter 12 Section 12.4 "Using Recursion to Create Visual Patterns"
In that, they use a recursion method to hold 2 variables which I also used.
Spaces tracks the amount of spaces
Line is the number of lines to perform that specific string of characters for
*/
public class diamond
{
    public static void Main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int line;
        System.out.println("Print the diamond? 1 = 'Yes' 0 = 'No'");
        int choice = input.nextInt();
        if (choice == 1)
        {
            printDiamond(line);
            printSpaces(0, line);
            System.out.println();
        }
        else if (choice == 0)
        {
            return -1;
        }
        else
        {
            System.out.println("Invalid input, please try again.");
            Main();
        }
    }

    void printDiamond(int spaces, int line)
    {
        if (line == 0)
            return;
        else
        {
            System.out.println("*");
            printDiamond(spaces, lines - 1);   
        }
    }

    void printSpaces(int line, int size)
    {
        if (count == 0)
            return;
        else
        {
            System.out.print(" ");
            printSpaces()
        }
    } 
}