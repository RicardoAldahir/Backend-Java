package practicaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class PeterParker extends Spiderman implements PeterParkerPowers{
    public PeterParker() {

    }

    public PeterParker(String name, String alias, String gender, String universe) {
        super(name, alias, gender, universe);
    }

    @Override
    public void show(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), "helvetica", 28, Colors.BlueHorizon);
        s.showImage("Spider_peter_parker.png");
    }

    @Override
    public void Superhumanstrength(Screen s) {
        s.out("\nPower\nSuperhuman strength: His extraordinary arachnid strength has allowed him to lift cars or buses and even tanks with great ease, normally he does not use his full strength, but when he uses it against enemies more powerful than him, this is a deadly weapon.\n");

    }

    @Override
    public void Perfectbalance(Screen s) {
        s.out("\nPower\nPerfect balance: ability of perfect balance and equilibrium, from practically any point imaginable.\n");
    }

}
