class Expense {
    String category;
    double amount;

    Expense(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }

    void display() {
        System.out.println("Category: " + category + " | Amount: ₹" + amount);
    }
}
