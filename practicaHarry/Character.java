package practicaHarry;

import imonsh.Screen;

public class Character {
    private String home,gender,name,boggart,patronus;

    public Character() {

    }

    public String getHome() {  return home;  }

    public boolean setHome(String home) {
        if(!home.isEmpty()){
            this.home = home;
            return true;
        } else
            return false;
    }

    public String getGender() {  return gender;  }

    public boolean setGender(String gender) {
        if(!gender.isEmpty()){
            this.gender = gender;
            return true;
        } else
            return false;
    }

    public String getName() {  return name;  }

    public boolean setName(String name) {
        if(!name.isEmpty()){
            this.name = name;
            return true;
        } else
            return false;
    }

    public String getBoggart() {  return boggart;  }

    public boolean setBoggart(String boggart) {
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        } else
            return false;
    }

    public String getPatronus() {  return patronus;  }

    public boolean setPatronus(String patronus) {
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        } else
            return false;
    }

    public  String showMessage(Screen s){
        s.setVisible(true);
        return  "Character information: "+
                "\nName: "+name+
                "\nHome: "+home+
                "\nGender: "+gender+
                "\nBoggart: "+boggart+
                "\nPatronus: "+patronus+"\n";
    }
}
