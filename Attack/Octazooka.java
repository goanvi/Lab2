package Attack;

import ru.ifmo.se.pokemon.*;

public class Octazooka extends SpecialMove {
    public Octazooka(){super (Type.WATER, 65,85);}

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.5).stat(Stat.ACCURACY, -1);
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {return "Ипользует атаку Octazooka";}
}
