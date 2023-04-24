package Homework4;

public interface Calculation {
    default double amountofpurchase(int count, double price) {
        return 0;
    }

}
