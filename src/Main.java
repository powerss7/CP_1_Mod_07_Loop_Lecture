import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // do while loop use every time for inpute
        //try to get the input
        //repeat until we get it

        /*
        do
        {

        }while(condition);

        boolean done = false;
        do
        {

        }while(!done);
         */

        Scanner in = new Scanner(System.in);

        //code form last lecture
        int age = -1;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\nEnter your age: ");
            if (in.hasNextInt()) {
                age = in.nextInt();
                in.nextLine();//this clears the buffer
                System.out.println("your age is: " + age);
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid number");
            }
        }while(!done);



        int favNum = 0;
        boolean done1 = false;

        do {
            System.out.print("what is your fav number  [1 and 10] ");
            if (in.hasNextInt()) {
                favNum = in.nextInt();
                in.nextLine();
                if (favNum >= 1 && favNum <= 10) {
                    System.out.println("\nyou said your fav num is " + favNum);
                    done1 = true;
                } else {
                    System.out.println("you said your fav num is " + favNum + " but that is out of range");
                }
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid number");
            }
        }while(!done1);



        boolean done2 = false;
        double itemPrice = 0;
        double totalPrices = 0;
        double avePrice = 0;
        int numItems = 0;
        String respYN = "";
        do
        {
            // get an item price
            System.out.print("enter the item price: ");

            if(in.hasNextDouble())
            {
                itemPrice = in.nextDouble();
                in.nextLine(); // clears the buffer

                //add the price to the total
                totalPrices += itemPrice; //totalPrice = totalPrice + itemPrice
                numItems++; //++ means add 1 to the value / numItems = numItems +1
            }
            else
            {
                trash = in.nextLine();
                System.out.println("you entered: " + trash + " must be a valid price!");
            }

            System.out.print("do you have another item [Y/N}");
            respYN = in.nextLine();
            if(respYN.equalsIgnoreCase("N"))
            {
                done2 = true;
            }

        }while (!done2);

        avePrice = totalPrices / numItems;

        System.out.println("total items is: " + numItems);
        System.out.println("total price  is:" + totalPrices);
        System.out.println("the average is: " + avePrice);




        double grade = -1; // valid grades are 0 to 100
        double aveGrade = 0;
        double totalGrades = 0;
        int numGrade = 0;
        final double SENTINAL = -1;
        boolean done3 = false;

        do
        {
            System.out.print("enter the grade [0 to 100] ot -1 to quit ");

            if(in.hasNextDouble())
            {
                grade = in.nextDouble();
                in.nextLine(); // clears the buffer

                if (grade != SENTINAL)
                {
                    //add the price to the total
                    totalGrades += grade; //totalPrice = totalPrice + itemPrice
                    numGrade++; //++ means add 1 to the value / numItems = numItems +1
                }
                else
                {
                    done3 = true;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("you entered " + trash + "must be a valid grade!");
            }
        } while (!done3);

        aveGrade = totalGrades / numGrade;

        System.out.println("total grades is: " + numGrade);
        System.out.println("total price  is:" + totalGrades);
        System.out.println("the average is: " + aveGrade);
    }
}