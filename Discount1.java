import java.util.ArrayList;

public class Discount1 {
    public static void main(String[] args) {
        System.out.println(skid(50, 1, 3));

    }
    public static ArrayList<Integer>skid(int discount, int offset, int readLenght){
        ArrayList<Integer> price = new ArrayList<>();
        price.add(5);
        price.add(100);
        price.add(20);
        price.add(66);
        price.add(16);
        for (int i = 1; i<4; i++){
            int riceDesc = price.get(i)/2;
            price.set(i,riceDesc);
        }
        return price;
    }
}
