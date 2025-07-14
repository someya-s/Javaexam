package jp.co.rakuspartners.java.basic.exam17;

public class Ex01 {
    public static void main(String[] args) {
        String[] friends = { "一郎", "次郎", "三郎", "四郎", "五郎", "六郎", "七郎" };

        for(String friend:friends){
            System.out.println(friend+"さん");
        }

        for(int i=0; i<friends.length; i++){
            System.out.println(friends[i]+"さん");

        }
    }

}
