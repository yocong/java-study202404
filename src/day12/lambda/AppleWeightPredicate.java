package day12.lambda;

public class AppleWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {

        return apple.getWeight() >= 100;
    }
}
