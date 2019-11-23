package factory;


import strategy.AccountTypes;
import strategy.with.InterestCalculationStrategy;

public class InterestCalculator {
    private final InterestCalculationStrategyFactory interestCalculationStrategyFactory = new InterestCalculationStrategyFactory();
    public double calculateInterest(AccountTypes accountType, double accountBalance) {
        InterestCalculationStrategy interestCalculationStrategy = interestCalculationStrategyFactory.getInterestCalculationStrategy(accountType);
        if (interestCalculationStrategy != null) {
            return interestCalculationStrategy.calculateInterest(accountBalance);
        } else {
            return 0;
        }
    }
}
