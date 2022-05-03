package practicaMultiverse;
import imonsh.Colors;
import imonsh.Screen;

public class GwendolyneStacy extends Spiderman implements GwendolyneStacyPowers{

    public GwendolyneStacy() {
    }

    public GwendolyneStacy(String name, String alias, String gender, String universe) {
        super(name, alias, gender, universe);
    }

    @Override
    public void show(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), "helvetica", 28, Colors.BlueHorizon);
        s.showImage("Gwen_Spider.png");
    }

    @Override
    public void Superhumanspeed(Screen s) {
        s.out("\nPower\nSuperhuman speed: Her speed and reflexes are several tens of times faster than any human being in perfect physical condition.\n");
    }

    @Override
    public void Organicspiderweb(Screen s) {
        s.out("\nPower\nOrganic spider web: Gwen can generate webs organically thanks to the secreting glands she houses on her forearms, although this causes a certain wear on her health and nutrition.\n");
    }
}
