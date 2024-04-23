public class A1093358_Project2_Environment
{
    // The probability that a default agent (explorer) chooses to stay in the tomb.
    private double defaultDecisionProbability;

    public A1093358_Project2_Environment()
    {
    }

    public void setDefaultDecisionProbability(double defaultDecisionProbability)
    {
        if (defaultDecisionProbability < 0 || defaultDecisionProbability > 1)
            throw new IllegalArgumentException("default probability is less than 0 or more than 1");

        this.defaultDecisionProbability = defaultDecisionProbability;
    }

    public double getDefaultDecisionProbability()
    {
        return this.defaultDecisionProbability;
    }
}
