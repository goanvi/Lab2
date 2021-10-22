package Attack;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class SleepPowder extends StatusMove {
    public SleepPowder(){super (Type.GRASS,0,75);}

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.sleep(pokemon);
    }

    @Override
    protected String describe() {
        return "Применяет способность Sleep powder";
    }
}
