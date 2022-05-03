package practicaMultiverse;

import imonsh.Screen;

public class TestSpiderman {
    public static void main(String[] args) throws InterruptedException{
        Screen s = new Screen();

        peterparker(s);
        Thread.sleep(3000);
        s.cls();
        s.repaint();
        gwenstacy(s);
        Thread.sleep(3000);
        s.cls();
        s.repaint();
        spiderwoman(s);
    }

    static void peterparker(Screen s){
        PeterParker spider1 = new PeterParker(
                "Peter James Parker",
                "Spider-man",
                "Male",
                "Earth-616"
        );


        spider1.show(s);
        spider1.Superhumanstrength(s);
        spider1.Perfectbalance(s);
    }

    static void gwenstacy(Screen s){
        GwendolyneStacy spider2 = new GwendolyneStacy(
                "Gwendolyne Maxine Stacy",
                "Ghost-Spider",
                "Female",
                "Earth-65, currently on Earth-616"
        );

        spider2.show(s);
        spider2.Superhumanspeed(s);
        spider2.Organicspiderweb(s);
    }

    static void spiderwoman(Screen s){
        SpiderWoman spider3 = new SpiderWoman(
                "Jessica Miriam Drew",
                "Spider-Woman",
                "Female",
                "Earth-616"
        );

        spider3.show(s);
        spider3.Poisonray(s);
        spider3.Pheromonesecretion(s);
    }
}
