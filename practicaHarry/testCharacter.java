package practicaHarry;
import imonsh.*;

public class testCharacter {
    public static void main(String[] args) {
        Screen s = new Screen();
        Character p1 = new Character();

        p1.setName("Harry James Potter");
        p1.setHome("Gryffindor");
        p1.setGender("Male");
        p1.setBoggart("Dementor");
        p1.setPatronus("Stag");

        s.out(p1.showMessage(s));
        s.showImage("Harry_Potter.png");
        s.setBounds(400,100, 500,600);

        s.out("\n \n");

        Character p2 = new Character();

        p2.setName("Hermione Jean Granger");
        p2.setHome("Gryffindor");
        p2.setGender("Female");
        p2.setBoggart("Failure");
        p2.setPatronus("Otter");

        s.out(p2.showMessage(s));
        s.showImage("Hermione.png");

        s.out("\n \n");

        Character p3 = new Character();

        p3.setName("Tom Marvolo Riddle o Lord Voldemort");
        p3.setHome("Slytherin");
        p3.setGender("Male");
        p3.setBoggart("His own corpse");
        p3.setPatronus("None");

        s.out(p3.showMessage(s));
        s.showImage("Voldemort.png");

        s.out("\n \n");

        Character p4 = new Character();

        p4.setName("Ronald Bilius Weasley");
        p4.setHome("Gryffindor");
        p4.setGender("Male");
        p4.setBoggart("Aragog");
        p4.setPatronus("Jack Russell terrier");

        s.out(p4.showMessage(s));
        s.showImage("Ronald.png");

        s.out("\n \n");

        Character p5 = new Character();

        p5.setName("Draco Lucius Malfoy");
        p5.setHome("Slytherin");
        p5.setGender("Male");
        p5.setBoggart("Lord Voldemort");
        p5.setPatronus("None");

        s.out(p5.showMessage(s));
        s.showImage("Draco.png");
    }
}
