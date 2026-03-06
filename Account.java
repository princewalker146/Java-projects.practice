// NUMBER1

public class Account {
    private String accountNumber;
    private String  accountHolderName;
    private double balance;
    private double amount;

    // SETTERS FOR THE PUBLIC VOID METHODS
  public void deposit(double amount){
       if(amount>0){
       balance +=amount;
        System.out.println("Deposit Sucessfull");
       } 
       else{
        System.out.println("Insufficient Funds");
       }
    }

    public void withdraw(double amount){
        if(amount<=balance){
            System.out.println("Invalid amount");
        }
          else if (amount>balance) {
              System.out.println("Insufficient Funds");
          }
else{
    balance-=amount;
    System.out.println("Withdrawal sucessful");
}
    }
    // GETTERS FOR THE RETURN METHODS
    double getBalance(){
        return balance;
    }
    String getAccountNumber(){
        return accountNumber;
    }
    public static void main(String[] args){
Account myBank=new Account();

myBank.deposit(34.43);
myBank.withdraw(6.54);
System.out.println("Deposit: "+myBank.getBalance());
    }
}
