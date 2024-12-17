class Main{
    public static void main(String[] args){
        Account account=new Account("Chitra Bdr Thapa Chhetri", 1000);
        double finalAmount=account.depositAmountToAccount( 1000);
        System.out.println("Your total balance after deposit::"+finalAmount);
        double finalAmount1=account.withdrawAmountFromAccount(2000);
        System.out.println("Your total balance after withdraw::"+finalAmount1);
        account.displayAccountNameAndAmount();


    }
}