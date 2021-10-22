package Attack;

import ru.ifmo.se.pokemon.*;

public class DoubleSlap extends PhysicalMove {
    public DoubleSlap(){
        super (Type.NORMAL,15,85,0,2);

    }

    @Override
    protected String describe() {return "Использует атаку Double Slap";}
}
