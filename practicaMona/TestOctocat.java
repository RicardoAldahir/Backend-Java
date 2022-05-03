package practicaMona;

import imonsh.Screen;

public class TestOctocat {
    Screen s = new Screen();
    public static void main(String[] args) {
        inspectocat();
        supportcat();
    }

    public static void inspectocat(){
        Screen s = new Screen();
        Inspectocat monainspect = new Inspectocat();

        monainspect.setId(23);
        monainspect.setName("Inspectocat");
        monainspect.activity(s);
    }

    public static void supportcat(){
        Screen s = new Screen();
        Supportcat monasupport = new Supportcat();

        monasupport.setId(32);
        monasupport.setName("Supportcat");
        monasupport.activity(s);
    }
}
