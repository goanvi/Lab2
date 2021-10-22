package Pokemons;

import Attack.DoubleSlap;
import Attack.DoubleTeam;
import Attack.Fly;
import Attack.MindReader;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Alomomola extends Pokemon {
    public Alomomola(String name, int level){
        super (name, level);
        setStats(165,75,80,40,45,65);
        setType(Type.WATER);
        setMove(new DoubleSlap(), new DoubleTeam(), new Fly(), new MindReader());

    }

}
