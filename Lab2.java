import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Lab2 {
    public static void main(String[] args) {
    Battle b = new Battle();
    Alomomola alomomola = new Alomomola("",1);
    Vileplume vileplume = new Vileplume("",1);
    Stufful stufful = new Stufful("", 1);
    Bewear bewear = new Bewear("", 1);
    Oddish oddish = new Oddish("", 1);
    Gloom gloom = new Gloom("", 1);
    b.addAlly(alomomola);
    b.addAlly(bewear);
    b.addAlly(oddish);
    b.addFoe(gloom);
    b.addFoe(stufful);
    b.addFoe(vileplume);
    b.go();
    }
}