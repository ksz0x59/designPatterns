package strategy.with;

import strategy.AccountTypes;

public class InterestCalculator {
    //Strategies for calculating interest.
    private final InterestCalculationStrategy currentAccountInterestCalculationStrategy = new CurrentAccountInterestCalculation();
    private final InterestCalculationStrategy savingsAccountInterestCalculationStrategy = new SavingsAccountInterestCalculation();
    private final InterestCalculationStrategy moneyMarketAccountInterestCalculationStrategy = new MoneyMarketInterestCalculation();
    private final InterestCalculationStrategy highRollerMoneyMarketAccountInterestCalculationStrategy = new HighRollerMoneyMarketInterestCalculation();
    public double calculateInterest(AccountTypes accountType, double accountBalance) {
        switch (accountType) {
            case CURRENT: return currentAccountInterestCalculationStrategy.calculateInterest(accountBalance);
            case SAVINGS: return savingsAccountInterestCalculationStrategy.calculateInterest(accountBalance);
            case STANDARD_MONEY_MARKET: return moneyMarketAccountInterestCalculationStrategy.calculateInterest(accountBalance);
            case HIGH_ROLLER_MONEY_MARKET: return highRollerMoneyMarketAccountInterestCalculationStrategy.calculateInterest(accountBalance);
            default:
                return 0;
        }
    }
}
