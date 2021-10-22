package Pokemons;

import Attack.LeechLife;
import ru.ifmo.se.pokemon.Type;

public class Vileplume extends Gloom {
    public Vileplume (String name, int level){
        super (name, level);
        setStats(75,80,85,110,90,50);
        setType(Type.GRASS, Type.POISON);
        addMove(new LeechLife());
    }
}
