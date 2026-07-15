package Lab1;
public class ProfitLoss {
    public static void main(String[] args) {
        double costPrice = 129;
        double sellingPrice = 191;

        double profitLoss = sellingPrice - costPrice;
        double profitLossPercent = (profitLoss / costPrice) * 100;

        if (profitLoss > 0) {
            System.out.println("Profit Amount  : INR " + profitLoss);
            System.out.println("Profit Percent : " + profitLossPercent + "%");
        } else if (profitLoss < 0) {
            System.out.println("Loss Amount  : INR " + Math.abs(profitLoss));
            System.out.println("Loss Percent : " + Math.abs(profitLossPercent) + "%");
        } else {
            System.out.println("No Profit, No Loss");
        }
    }
}