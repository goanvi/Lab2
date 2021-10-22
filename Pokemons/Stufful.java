package Pokemons;

import Attack.IceBeam;
import Attack.Octazooka;
import Attack.SecretPower;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Stufful extends Pokemon {
    public Stufful (String name, int level){
        super (name, level);
        setStats(70,75,50,45,50,50);
        setType(Type.NORMAL, Type.FIGHTING);
        setMove(new IceBeam(), new SecretPower(), new Octazooka());
    }
}
