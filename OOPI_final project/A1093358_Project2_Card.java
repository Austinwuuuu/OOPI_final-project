public abstract class A1093358_Project2_Card
{
    // Type of this card.
    private final int type;

    public A1093358_Project2_Card(int type)
    {
        this.type = type;
    }

    public abstract String name();

    public int getType()
    {
        return this.type;
    }
}
