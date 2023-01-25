
public class Review01 {

    public static void main(String[] args) {

        int price=1500;
        double tax_rate=10.0;

        int tax=tax(price,tax_rate);

        int Tax_incluededprice=price+tax;

        System.out.println(price+"円の商品の税込み価格は"+Tax_incluededprice+"円(消費税は"+tax+"円)です。");


    }

    public static int tax(int price,double tax_rate) {
        int tax=(int)(price*(tax_rate/100));
        return tax;
    }

}
