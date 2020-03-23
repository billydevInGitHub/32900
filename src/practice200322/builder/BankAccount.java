package practice200322.builder;

public class BankAccount {
    String accountNumber;
    String ownerName;

    private BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String toString(){
        return "BankAccount Info:"+this.accountNumber+"|"+this.ownerName;
    }

    public static class BankAccountBuilder {
        String accountNumber;
        String ownerName;

        public BankAccountBuilder buildAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public BankAccountBuilder buildOwnerName(String ownerName) {
            this.ownerName=ownerName;
            return this;
        }

        public BankAccount build() {
            BankAccount bankAccount= new BankAccount(accountNumber);
            bankAccount.ownerName=ownerName;
            return bankAccount;
        }
    }

}
