package Pokemons;

import Attack.HyperVoice;
import ru.ifmo.se.pokemon.Type;

public class Bewear extends Stufful {
    public Bewear (String name, int level){
        super (name, level);
        setStats(120, 125, 80, 55, 60, 60);
        setType(Type.NORMAL, Type.FIGHTING);
        addMove(new HyperVoice());
    }
}
