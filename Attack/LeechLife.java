package Attack;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class LeechLife extends PhysicalMove {
    public LeechLife(){super (Type.BUG,80,100);}

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.HP, -(((int) pokemon.getStat(Stat.ATTACK))/2));
    }

    @Override
    protected String describe() {
        return "Использует атаку Leech life";
    }
}
