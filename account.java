package javaBasic.Task10;

public class account {

    static double balance;
    
    public account(){
        this.balance = 0;
    }
    public account(double bal){
        this.balance = bal;
    }
    public void balanceCheck(){
        System.out.println("The Balance is:" + balance);
    }
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("The deposit Amount:" +amount);
        System.out.println("After deposit balance: "+balance);
    } 
    public void withdraw(double amount){
        balance = balance - amount;
       // balance = balance - amount2;
       System.out.println("The Withdraw amount: "+ amount);
       System.out.println("The balance after withdraw: "+ balance);
    }


    public static void main(String []args){

        account a1 = new account();

        System.out.println("1st - Account details ");
         
        a1.balanceCheck();
        a1.deposit(5000);
    
        a1.withdraw(1500);
        a1.balanceCheck();

        System.out.println("2nd - Account details:");

        account a2 = new account(10000);
        a2.balanceCheck();
        a2.deposit(1000);
    
        a2.withdraw(500);
        a2.balanceCheck();
      

        

    }
    
    
}
