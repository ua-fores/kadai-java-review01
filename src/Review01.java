
public class Review01 {

    public static void main(String[] args) {
        // ○○円の商品の税込価格は○○円（消費税は○○円）です。と表示されるプログラムを書く
        final double TAXRATE = 0.1;
        int exclusiveTaxPrice;
        int includingTaxPrice;
        int consumptionTax;

        // 消費税を計算する
        exclusiveTaxPrice = 1500;
        consumptionTax = tax(exclusiveTaxPrice, TAXRATE);

        // 税込み価格を計算する
        includingTaxPrice = exclusiveTaxPrice + consumptionTax;

        // 結果を出力する
        System.out.println(exclusiveTaxPrice + "円の商品の税込価格は"
                            + includingTaxPrice + "円（消費税は"
                            + consumptionTax + "円）です。");
    }

    public static int tax(int exclusiveTaxPrice, double taxRate) {
        double result = (double) exclusiveTaxPrice * taxRate;

        return (int) result;
    }

}
