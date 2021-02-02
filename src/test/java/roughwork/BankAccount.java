package roughwork;

public class BankAccount {

    public int owner;
    private double balance = 0;
    protected int age;
 public BankAccount(int owner,double balance,int age){
     this.age = age;
     this.balance = balance;
     this.owner = owner;
 }

 public double getBalance(){
     return balance;
 }
 public int age(){
     return this.age;
 }

 public int owner(){
     return this.owner;
 }
}
