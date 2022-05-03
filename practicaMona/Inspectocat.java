package practicaMona;

import imonsh.Screen;

public class Inspectocat extends MonaOctocat{

    @Override
    public void activity(Screen s){
        s.setVisible(true);
        s.out(showMessage());
        s.out("Research and analyze repositories on github.\n");
        s.showImage("inspectocat.jpg");
        s.setBounds(200,100,500,500);
    }
}
