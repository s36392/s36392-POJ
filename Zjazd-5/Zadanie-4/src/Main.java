public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(101, "Alice", 10);
        Invoice inv = new Invoice(1, customer, 200.0);

        System.out.println(customer);
        System.out.println("Customer name: " + inv.getCustomerName());
        System.out.printf("Amount: %.2f%n", inv.getAmount());
        System.out.printf("After discount: %.2f%n", inv.getAmountAfterDiscount());
    }
}