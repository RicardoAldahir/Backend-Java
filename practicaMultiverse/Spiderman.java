package practicaMultiverse;

public class Spiderman {

    private String name, alias, gender, universe;

    public Spiderman() {

    }

    public Spiderman(String name, String alias, String gender, String universe) {
        this.name = name;
        this.alias = alias;
        this.gender = gender;
        this.universe = universe;
    }

    public String getName() {  return name;  }

    public boolean setName(String name) {
        if(!name.isEmpty()){
            this.name = name;
            return true;
        } else
            return false;
    }

    public String getAlias() {  return alias;  }

    public boolean setAlias(String alias) {
        if(!alias.isEmpty()){
            this.alias = alias;
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

    public String getUniverse() {  return universe;  }

    public boolean setUniverse(String universe) {
        if(!universe.isEmpty()){
            this.universe = universe;
            return true;
        } else
            return false;
    }

    public String showMessage(){
        return  "Spider-man information"+
                "\nName: "+name+
                "\nAlias: "+alias+
                "\nGender: "+gender+
                "\nUniverse: "+universe+"\n";
    }
}
