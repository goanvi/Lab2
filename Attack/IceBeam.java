package Attack;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {
    public IceBeam(){super (Type.ICE, 90, 100);}

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (!pokemon.hasType(Type.ICE)) {
            Effect e = (new Effect()).chance(0.1).condition(Status.FREEZE).attack(0.0D).turns(-1);
            pokemon.addEffect(e);
        }
    }

    @Override
    protected String describe() {return "Использует атаку Ice Beam";}
}
