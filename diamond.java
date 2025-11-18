import java.util.Scanner;

/*
The recursion works by printing a triangle, then mirroring that and printing that same triangle backwards.
Thus making the diamond! Originally, I had used the example from Chapter 12. But as the program evolved
I had to 
*/
public class diamond
{
    public static void main(String[] args)
    {
        diamond d = new diamond();
        Scanner input = new Scanner(System.in);
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
        int middle = size / 2 + 1;
        int leftStar, rightStar;
        int space;

        if (line <= middle)
        {
            leftStar = size - (line - 1);
            rightStar = leftStar;
            space = (line - 1) * 2 - 1;
            if (space < 0)
                space = 0;
        }
        else
        {
            int mirror = size - line + 1;
            leftStar = size - (mirror - 1);
            rightStar = leftStar;
            space = (mirror - 1) * 2 - 1;
            if (space < 0)
                space = 0;
        }
        printDiamond(leftStar);
        if (line == 2 || line == 22)
        {
            printSpaces(space, false);
        }
        else
        {
            printSpaces(space, true);
        }
        printDiamond(rightStar);
        System.out.println();

        printStyle(line + 1, size);
    }

    void printDiamond(int count)
    {
        if (count == 0)
            return;
        System.out.print("*");
        printDiamond(count - 1);   
    }

    void printSpaces(int count, boolean doubleSpace)
    {
        if (count == 0)
            return;

        if (doubleSpace)
            System.out.print("  ")
        else
            System.out.print(" ");

        printSpaces(count - 1, doubleSpace);
    } 
}