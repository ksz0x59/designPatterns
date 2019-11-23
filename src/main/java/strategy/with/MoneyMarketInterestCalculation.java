package strategy.with;

public class MoneyMarketInterestCalculation implements InterestCalculationStrategy {
    @Override
    public double calculateInterest(double accountBalance) {
        return accountBalance * (0.06/12);
    }
}
