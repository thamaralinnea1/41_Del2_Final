public class BankAccount {

    int  account;
    static int bottomBalance = 0;

     // set balance to startbalance
    public BankAccount() {
        account = 1000;


    }

    public void setAccount(int account) {
        this.account = account;
    }

    //Get square value and find the new balance
    public void addPoints(int squareValue) {
      account += squareValue;
  if (account<bottomBalance){
      account = bottomBalance;
  }
    }
    // return balance to monopoly game
    public int getBalance (){
    return account;
    }

}

