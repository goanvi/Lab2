package Attack;

import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove {
    public SludgeBomb(){super (Type.POISON,90,100);}

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (!pokemon.hasType(Type.POISON) && !pokemon.hasType(Type.STEEL)) {
            Effect var1 = (new Effect()).chance(0.3).condition(Status.POISON).turns(-1);
            var1.stat(Stat.HP, (int)pokemon.getStat(Stat.HP) / 8);
            pokemon.addEffect(var1);
        }
    }

    @Override
    protected String describe() {
        return "Использует способность Sludge bomb";
    }
}
