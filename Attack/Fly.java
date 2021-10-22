package Attack;

import ru.ifmo.se.pokemon.*;

public class Fly extends PhysicalMove {
    public Fly(){super (Type.FLYING, 90,95);}

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect e = new Effect().turns(1).stat(Stat.EVASION,6);
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {return"Применяет способность Fly";}
}
