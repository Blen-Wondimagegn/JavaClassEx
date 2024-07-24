package JavaClassPA;

public class JavaclassDriver {
    public static void main(String args[]) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.annualInterestRate = 0.03;
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("Saver 1 balance after 1 month at 3%%: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 balance after 1 month at 3%%: $%.2f%n", saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("Saver 1 balance after 1 month at 4%%: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 balance after 1 month at 4%%: $%.2f%n", saver2.getSavingsBalance());

        Pizza myPizza = new Pizza("large", 2, 3, 1);

        // Print the pizza description
        System.out.println(myPizza.getDescription());

        // Print the cost of the pizza
        System.out.println("Total Cost: $" + myPizza.calcCost());

    }
}
