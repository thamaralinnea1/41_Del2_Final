import java.util.Scanner;

public class Player {

    public String name;

    public BankAccount account;

    public Player(){
        this.name = name;

        this.account = new BankAccount();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}



