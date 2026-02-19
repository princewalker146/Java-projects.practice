public class BankAccount {
    private String accountHolderName;
    private int  accountNumber;
    private double accountBalance;
    private double deposit;
    public void setAccountHolderName( String accountHolderName){
this.accountHolderName=accountHolderName;
    }
    String getAccountHolderName(){
        return accountHolderName;
    }
    public void setAccountNumber(int accountNumber){
        if(accountNumber>=5){
            this.accountNumber=accountNumber;
        }
        else{
            System.out.println("ACESS DENIAL");
        }
        
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void allowDeposit( double deposit){
        if(deposit>5){
        this.deposit= deposit;    
        }
else{
    System.out.println("Deposit not enough");
}
    }
    public double getDeposit(){
        return deposit;
    }

    
    public void setAccountBalance(double accountBalance){
this.accountBalance=accountBalance;
    }
    double getAccountBalance(){
        return accountBalance;
    }
    public static void main(String[] args){

        BankAccount myPace= new BankAccount();
        myPace.setAccountHolderName("Prince146");
        System.out.println("Account Holder: "+myPace.getAccountHolderName());
        myPace.setAccountNumber(0564);
        System.out.println("Account Number "+myPace.getAccountNumber());
        myPace.setAccountBalance(7);
        System.out.println("Account Balance :"+myPace.getAccountBalance());
    
    }
}
