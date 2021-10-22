package Attack;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class MegaDrain extends SpecialMove {
    public MegaDrain(){super (Type.GRASS,40,100);}

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.HP, -(((int) pokemon.getStat(Stat.ATTACK))/2));
    }

    @Override
    protected String describe() {
        return "Использует способность Mega drain";
    }
}
