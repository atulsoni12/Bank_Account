import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount("Akshat " , "N1008");
        obj1.showMenu();

    }
}
    class BankAccount
{
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cname, String cid)
    {
        customerName = cname;
        customerId = cid;
    }

    // deposit
    void deposit(int amount)
    {
        if (balance !=0)
        {
            balance = balance + amount;
            previousTransaction = balance;
        }
    }
        //withdraw
        void withdraw(int amount)
        {
            if (balance!=0);
            {
                balance = balance - amount;
                previousTransaction = -balance;
            }
            }

            void getPreviousTransaction()
            {
            if (previousTransaction>0)
            {
                System.out.println("Deposited: "+previousTransaction);
            }
            else if(previousTransaction<0)
            {
                System.out.println("withdrawal:  "+Math.abs(previousTransaction));

            }
            else {
            System.out.println("No transactions occured");

        }
            }
     void showMenu()
    {
            char option = '\0';
            Scanner scanner= new Scanner(System.in);

            System.out.println("Welcome " +customerName);
            System.out.println("Your Id is "  +customerId);
            System.out.println("\n");
            System.out.println("A. Check balance");
            System.out.println("B. Deposit");
            System.out.println("C. Withdraw");
            System.out.println("D. PreviousTransaction");
            System.out.println("E. Exit");

            do
                {
                    System.out.println("------------------------------------");
                    System.out.println("Enter an option");
                    System.out.println("------------------------------------");
                    option = scanner.next().charAt(0);
                    System.out.println("\n");

                    switch (option)
                    {
                        case 'A':
                            System.out.println("--------------------------");
                            System.out.println("balance"  +balance);
                            System.out.println("--------------------------");
                            System.out.println("\n");
                            break;

                        case 'B':
                            System.out.println("---------------------------");
                            System.out.println("Enter an amount to deposit");
                            System.out.println("---------------------------");
                            int amount = scanner.nextInt();
                            deposit(amount);
                            System.out.println("\n");
                            break;

                        case 'C':
                            System.out.println("---------------------------");
                            System.out.println("Enter an amount to withdraw");
                            System.out.println("---------------------------");
                            int amount2 = scanner.nextInt();
                            deposit(amount2);
                            System.out.println("\n");
                            break;

                        case 'D':
                            System.out.println("---------------------------");
                            getPreviousTransaction();
                            System.out.println("---------------------------");
                            System.out.println("\n");

                        case 'E':
                            System.out.println("****************************");
                            break;

                        default:
                            System.out.println("Invalid option!! please enter again");
                    }



            }
            while (option != 'E');
                 System.out.println("Thank you for using services");

        }
}