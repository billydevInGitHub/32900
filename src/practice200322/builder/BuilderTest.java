package practice200322.builder;

public class BuilderTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount.BankAccountBuilder().buildAccountNumber("123456").buildOwnerName("testowner").build();
        System.out.println(bankAccount);
    }
}
