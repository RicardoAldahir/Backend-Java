package practicaMona;

import imonsh.Screen;

public class Supportcat extends MonaOctocat{

    @Override
    public void activity(Screen s) {
        s.setVisible(true);
        s.out(showMessage());
        s.out("Help by supporting new developers.\n");
        s.showImage("supportcat.png");
        s.setBounds(200,100,500,500);
    }
}
