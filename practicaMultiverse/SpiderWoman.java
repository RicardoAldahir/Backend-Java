package practicaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class SpiderWoman extends Spiderman implements SpiderWomanPowers{
    public SpiderWoman() {
    }

    public SpiderWoman(String name, String alias, String gender, String universe) {
        super(name, alias, gender, universe);
    }


    @Override
    public void show(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), "helvetica", 28, Colors.BlueHorizon);
        s.showImage("Spider_Woman.png");
    }

    @Override
    public void Poisonray(Screen s) {
        s.out("\nPower\nPoison ray: Its physiology naturally produces bioelectric energy, which it can channel in the form of 'poisonous rays', although in reality they leave their victims stunned by affecting the nervous system.\n");
    }

    @Override
    public void Pheromonesecretion(Screen s) {
        s.out("\nPower\nPheromone secretion: Her metabolism generates pheromones that induce attraction to the opposite sex, and cause fear or repulsion with the same sex.\n");
    }
}
