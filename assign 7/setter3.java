class BankAccount {
    private String accNumber;
    private String holderName;
    private double balance;

    public void accNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accNumber("1234567890");
        account.setHolderName("yz");
        account.setBalance(1500);
        account.displayBalance();
    }
}
