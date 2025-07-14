package jp.co.rakuspartners.java.basic.exam14;

public class Ex02 {
    public static void main(String[] args) {
        carclass estima = new carclass();

        estima.speed = 50;
        estima.name = "エスティマ";

        carclass prius = new carclass();

        prius.speed = 30;
        prius.name = "プリウス";

        estima.stepOnAccele();
        estima.stepOnAccele();
        estima.stepOnBrake();

        prius.stepOnAccele();
        prius.stepOnAccele();
        prius.stepOnAccele();
        prius.stepOnAccele();
        prius.stepOnAccele();
        prius.stepOnBrake();
        prius.stepOnBrake();
        prius.stepOnBrake();

        System.out.println(estima.name +"の現在の速度は" + estima.speed + "km/hです。");
        System.out.println(prius.name +"の現在の速度は" + prius.speed + "km/hです。");

    }

}
