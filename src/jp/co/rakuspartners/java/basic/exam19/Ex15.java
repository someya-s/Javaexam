package jp.co.rakuspartners.java.basic.exam19;

public class Ex15 {
    public static void main(String[] args) {
        Ex15VendingMachine vend = new Ex15VendingMachine();

        vend.buyItem();
        vend.refillStock(3);
        vend.buyItem();
        vend.putMoney(500);
        vend.buyItem();
        vend.buyItem();
        vend.buyItem();
        vend.refillStock(3);
        vend.buyItem();
        vend.buyItem();
        vend.buyItem();
    }

}
