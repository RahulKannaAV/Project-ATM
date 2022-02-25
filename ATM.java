package Machine;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import Machine.*;
class ATM
{
    public static int t;
    public static void main(String args[])
    {
    Scanner inp=new Scanner(System.in);
    Aero pack=new Aero();
    System.out.print("Welcome to City Union Bank\n Enter your Password: ");
    int pass=inp.nextInt();
    boolean loop;
    if(pass==2004)
    {
    loop= true;
    }
    else
    {
        System.out.print("INCORRECT PASSWORD!! TRY AGAIN");
        loop= false;
    }
    while(loop)
    {
    System.out.print("Do you want to?\n1.Deposit\n2.Withdraw\n3.Balance Details\n4.Exit\n");
    int ch=inp.nextInt();
    switch(ch)
    {
        case 1:
            System.out.print("Enter the amount to deposit: ");
            int usd=inp.nextInt();
            pack.deposit(usd);
            break;
        case 2:
            System.out.print("Enter the amount to withdraw: ");
            int msd=inp.nextInt();
            pack.withdraw(msd);
            break;
        case 3:
        try{
            FileWriter receipt=new FileWriter("D:City Union Bank.txt",false);
            receipt.write("---------------------------------------------------------------");
            receipt.write("\nBalance Amount: Rs."+pack.t);
            receipt.write("\n----------------------------------------------------------------");
            receipt.close();
            System.out.print("\nBalance Receipt is Generated\n");
        }
        catch(IOException x)
        {
            System.out.print("\nBill not generated");
        }        

            break;
        case 4:
            loop = false;
            break; 
    }
    }
}
/*public static void deposit(int rup)
{
    t+=rup;
    System.out.print("You have deposited: Rs."+rup);
    System.out.print("\nBalance : Rs."+t+'\n');
}


public static void withdraw(int wit)
{
    if(t-wit>1000)
    {
    t-=wit;
    System.out.print("You have withdrawn Rs."+wit);
    System.out.print("\nBalance : Rs."+t+"\n");
    }
    else
    {
        System.out.print("Balance withdrawal not possible\n");
    }
}*/
}


