package Machine;
public class Aero
{
    static int t=1000;
    static int rup;
    static int wit;
    public void deposit(int rup)
    {
        t+=rup;
        System.out.print("You have deposited: Rs."+rup);
        System.out.print("\nBalance : Rs."+t+'\n');
    }
    public void withdraw(int wit)
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
}
}