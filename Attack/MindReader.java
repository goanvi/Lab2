package Attack;

import ru.ifmo.se.pokemon.*;

public class MindReader extends StatusMove {
    public MindReader(){super (Type.NORMAL,0,0);}

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect e = new Effect().attack(1).turns(2).stat(Stat.ACCURACY, 6);
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {return "Применяет спосоюность Mind Reader";}
}
