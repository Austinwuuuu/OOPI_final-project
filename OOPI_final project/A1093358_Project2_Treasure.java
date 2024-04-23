import java.util.ArrayList;

public abstract class A1093358_Project2_Treasure extends A1093358_Project2_Card
{
    // The original value of this treasure card.
    private final int value;
    
    public A1093358_Project2_Treasure(int type, int value)
    {
        super(type);
        this.value = value;
    }

    public int getValue()
    {
        return this.value;
    }

    public abstract void share(ArrayList<A1093358_Project2_Agent> receivers);
}
