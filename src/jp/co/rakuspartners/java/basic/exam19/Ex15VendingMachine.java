package jp.co.rakuspartners.java.basic.exam19;

public class Ex15VendingMachine {
    public static final int price = 120;
    int money = 0;
    int stock = 0;
    
    void refillStock(int addstock){
        if (stock >= 10){
            System.out.println("商品がいっぱいです");
        }else if(stock < 10 && stock >= 0){
            stock = stock + addstock;
            System.out.println("在庫が"+stock+"個になりました");
        }
    }
    void putMoney(int addmoney){
        money = money + addmoney;
        System.out.println("入金金額が"+money+"円になりました");         
    }

    void buyItem(){
        if(stock <= 0){
            System.out.println("在庫を追加してください");
        }else if(money < price){
            System.out.println("お金を追加してください");            
        }else{
            stock--;
            money -= price;
            System.out.println("商品を購入しました");
            System.out.println("在庫が" + stock + "個になりました");
        }
    }
}
