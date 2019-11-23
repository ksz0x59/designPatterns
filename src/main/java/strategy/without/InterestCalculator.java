package strategy.without;

import strategy.AccountTypes;

public class InterestCalculator {
    public double calculateInterest(AccountTypes accountType, double accountBalance) {
        switch (accountType) {
            case CURRENT: return accountBalance * (0.02 / 12);  //Monthly interest rate is annual rate / 12 months.
            case SAVINGS: return accountBalance * (0.04 / 12);
            case STANDARD_MONEY_MARKET: return accountBalance * (0.06/12);
            case HIGH_ROLLER_MONEY_MARKET: return accountBalance < 100000.00 ? 0 : accountBalance * (0.075/12);
            default:
                return 0;
        }
    }
}
