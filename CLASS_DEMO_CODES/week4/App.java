import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //load accounts
        //BankAccount[] accounts;
        ArrayList<BankAccount> accounts = new ArrayList<>();
        loadAccounts(accounts);

        //login
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO JAVA ATM");
        System.out.println("Enter account number to proceed:");
        String acctNo = sc.nextLine();
        System.out.println("Enter PIN:");
        int pin = sc.nextInt();

        //Check if account is existing
        BankAccount newSessionUser = null;
        for(BankAccount a: accounts){
            if(a.getAcctNo().equals(acctNo)){
                newSessionUser = a; //assign to new session user if match is found
                break;
            }
        }

        //try if account exist then check PIN
        if(newSessionUser != null){
            if(newSessionUser.getPin() == pin){
                System.out.println("Welcome...");
                //begin transaction
                beginTransaction(newSessionUser);
            }else{
                System.out.println("Sorry try again...");
            }
        }else{
            System.out.println("Sorry try again...");
        }



    }


    public static void beginTransaction(BankAccount account){
        System.out.println("""
            Menu
            1. Balance Inquiry
            2. Deposit
            3. Withdraw
            0. Exit
        
        """);
        System.out.println("Choice: ");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        switch(c){
            case 1:
                System.out.println("Current Balance: " + account.getBalance());
                break;
        }
    }

    public static void  loadAccounts(ArrayList<BankAccount> accounts){
        try(Scanner reader = new Scanner(new File("accounts.csv"))){
            reader.nextLine();
            while(reader.hasNextLine()){
                String[] cols = reader.nextLine().split(",");
                String acctNo = cols[0];
                String fullName = cols[1];
                float balance = Float.parseFloat(cols[2]);
                int pin = Integer.parseInt(cols[3]);

                BankAccount acc = new BankAccount(acctNo, pin, balance, fullName);
                accounts.add(acc);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
