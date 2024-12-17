//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class Account{
    String accountName;
    double accountAmount;
    Account(String name, double amount){
        this.accountName=name;
        this.accountAmount=amount;
    }
    double depositAmountToAccount(double deposit_amount){
        this.accountAmount=deposit_amount+this.accountAmount;
        return this.accountAmount;
    }
    double withdrawAmountFromAccount(double withdraw_amount){
        this.accountAmount=this.accountAmount-withdraw_amount;
        return this.accountAmount;
    }
    void displayAccountNameAndAmount(){
        System.out.println("Account Name: "+this.accountName);
        System.out.println("Account Amount Rs. "+this.accountAmount);
    }
}
