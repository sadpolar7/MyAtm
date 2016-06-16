import java.util.Scanner;

/**
 * Created by AK on 6/15/16.
 */
public class User {
    private String name;
    private String options;
    private int withdraw;
    private int balance = 100;


    private Scanner scanner = new Scanner(System.in);

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getOptions() {
        return this.options;
    }

    public int getWithdraw() {
        return this.withdraw;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }


    public void chooseName() throws Exception {
        String name = null;

        while (name == null) {
            System.out.println("Please enter Name");
            name = scanner.nextLine();
        }
    }

    public void chooseOption() throws Exception {
        String option = null;

        while (options == null) {
            System.out.println("Choose an option [Check my balance/Withdraw Funds/Cancel]");
            options = scanner.nextLine();

            if (options.equalsIgnoreCase("Check my balance")) {
                System.out.println("Your balance is $100");

            }
            else if (options.equalsIgnoreCase("Cancel")) {
                System.out.println("Thank you and please come again.");

            }
            else if (options.equalsIgnoreCase("Withdraw Funds")) {
                System.out.println("How much to withdraw?");
                withdraw = scanner.nextInt();
                }
                if (withdraw > balance) {
                    System.out.println("Insufficient funds");
                } else {
                    this.balance = balance - withdraw;

                    System.out.println("New balance is " + balance);
                }


            }


        }


    }

