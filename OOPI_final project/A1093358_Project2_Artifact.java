import java.util.ArrayList;

public class A1093358_Project2_Artifact extends A1093358_Project2_Treasure
{
    // It determines whether this artifact is currently deposited in the tomb or not.
    private boolean inTomb;
    
    public A1093358_Project2_Artifact(int type, int value)
    {
        super(type, value);
        this.inTomb = true;
    }

    public boolean isInTomb()
    {
        /********************************* TODO (Checkpoint 2) *********************************
         * TODO 3-1: Get the variable $inTomb via this accessor method.
         ************************************* End of TODO *************************************/

        /************ START OF YOUR CODE ************/
        return this.inTomb;
        /************* END OF YOUR CODE *************/
    }

    @Override
    public String name()
    {
        /********************************* TODO (Checkpoint 2) *********************************
         * TODO 3-2: The name of this artifact card depends on its type. There are 5 kinds of artifacts in total.
         * Hint 1: From type 0 to 4, the names are "Meteoric Dagger", "Ankh", "Falcon Pectoral",
         *         "Crook and Flail" and "Mask of Tutankhamun" in order.
         * Hint 2: The name will be "Unknown" when the type is unexpectedly not between 0 and 4.
         ************************************* End of TODO *************************************/

        /************ START OF YOUR CODE ************/
        switch(this.getType())
        {
            case 0 :
                return "Meteoric Dagger"; 
            case 1 :
                return "Ankh";
            case 2 :
                return "Falcon Pectoral";
            case 3 :
                return "Crook and Flail";
            case 4 :
                return "Mask of Tutankhamun";
            default :
                return "Unknown";
        }

        /************* END OF YOUR CODE *************/
    }
    
    @Override
    public void share(ArrayList<A1093358_Project2_Agent> receivers)
    {
        /********************************* TODO (Checkpoint 2) *********************************
         * TODO 3-3: A valuable artifact can be taken away by the one and only one explorer who is leaving the tomb.
         * Hint 1: If there is more than 1 explorer who is leaving the tomb, then no one can get this artifact.
         * Hint 2: When an artifact is taken, it is no longer in the tomb and should be added into the receiver's possession.
         * Hint 3: Artifacts are accessible while they are now deposited in the tomb.
         * Notice 1: Provided that explorers stay in the tomb (haven't decided to leave),
         *           they can't pick up the artifact even if they are the only one who sees it.
         ************************************* End of TODO *************************************/

        /************ START OF YOUR CODE ************/
        if(receivers.size()==1&&this.inTomb==true){
            receivers.get(0).getOwnedArtifacts().add(this);
            this.inTomb=false;
        }
        /************* END OF YOUR CODE *************/
    }
    
    @Override
    public String toString()
    {
        if (this.inTomb)
            return String.format("<A: %s %d>", this.name(), this.getValue());
        else
            return "<A: --->";
    }
}
