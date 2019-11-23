package factory;


import strategy.AccountTypes;
import strategy.with.CurrentAccountInterestCalculation;
import strategy.with.HighRollerMoneyMarketInterestCalculation;
import strategy.with.InterestCalculationStrategy;
import strategy.with.MoneyMarketInterestCalculation;
import strategy.with.SavingsAccountInterestCalculation;

class InterestCalculationStrategyFactory {

    private final InterestCalculationStrategy currentAccountInterestCalculationStrategy = new CurrentAccountInterestCalculation();
    private final InterestCalculationStrategy savingsAccountInterestCalculationStrategy = new SavingsAccountInterestCalculation();
    private final InterestCalculationStrategy moneyMarketAccountInterestCalculationStrategy = new MoneyMarketInterestCalculation();
    private final InterestCalculationStrategy highRollerMoneyMarketAccountInterestCalculationStrategy = new HighRollerMoneyMarketInterestCalculation();

    //A factory can create a new instance of a class for each request, but since our calculation strategies are stateless,
    //we can hang on to a single instance of each strategy and return that whenever someone asks for it.
    public InterestCalculationStrategy getInterestCalculationStrategy(AccountTypes accountType) {
        switch (accountType) {
            case CURRENT: return currentAccountInterestCalculationStrategy;
            case SAVINGS: return savingsAccountInterestCalculationStrategy;
            case STANDARD_MONEY_MARKET: return moneyMarketAccountInterestCalculationStrategy;
            case HIGH_ROLLER_MONEY_MARKET: return highRollerMoneyMarketAccountInterestCalculationStrategy;
            default: return null;
        }
    }
}
