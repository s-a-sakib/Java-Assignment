public class TaxCalculator {
    private double amount;
    private String S;

    public TaxCalculator(String s, double money) {
        amount = money;
        S = s;
    }

    public double getPayAbleAmount() {
        double PayAbleAmount;
        // Calculation for unmarried person
        if (S == Constant.No) {
            if (amount >= Constant.UnmarriedLv1 && amount < Constant.UnmarriedLv2) {
                PayAbleAmount = (amount * 10) / 100;
            } else if (amount >= Constant.UnmarriedLv2 && amount < Constant.UnmarriedLv3) {
                PayAbleAmount = 800 + ((amount - 8000) * 15) / 100;
            } else {
                PayAbleAmount = 4400 + ((amount - 32000) * 25) / 100;
            }
        }
        //Calculation for married person
        else {
            if (amount >= Constant.MarriedLv1 && amount < Constant.MarriedLv2) {
                PayAbleAmount = (amount * 10) / 100;
            } else if (amount >= Constant.MarriedLv2 && amount < Constant.MarriedLv3) {
                PayAbleAmount = 1600 + ((amount - 16000) * 15) / 100;
            } else {
                PayAbleAmount = 8800 + ((amount - 64000) * 25) / 100;
            }
        }
        return PayAbleAmount;
    }
}