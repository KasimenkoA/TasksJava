public class Task134
    {
        public static void main( String[] args )
            {
                BankAccount bankAccount = new BankAccount( "125","Alexey", 1000 );
                bankAccount.addMoney( 23 );
                bankAccount.takeMoney( 10 );
                bankAccount.showRestMoney();
            }
    }

class BankAccount
    {
        String accountNumber;
        String ownerName;
        int balance;

        public BankAccount( String accountNumber, String ownerName, int balance )
            {
                this.accountNumber = accountNumber;
                this.ownerName = ownerName;
                this.balance = balance;
            }

        public void showRestMoney()
        {
            System.out.println("Total money: " + balance);
        }

        public void addMoney (int mm)
            {
                this.balance += mm;
                System.out.println("Add: " + mm);
                showRestMoney();
            }

        public void takeMoney ( int mm )
            {
                this.balance -= mm;
                System.out.println("Take: " + mm);
                showRestMoney();
            }
    }
