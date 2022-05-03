package practicaMona;

import imonsh.Screen;

public class MonaOctocat {
    private int id;
    private String name;

    public MonaOctocat() {

    }

    public int getId() {  return id;  }
    public String getName() {  return name;  }

    public boolean setId(int id) {
        if(id > 0){
            this.id = id;
            return true;
        } else
            return false;
    }

    public boolean setName(String name) {
        if(!name.isEmpty()){
            this.name = name;
            return true;
        } else
            return false;
    }

    public void activity(Screen s){

    }

    public String showMessage(){
        return  "Octocat mona information\n"+
                "\nId: "+id+
                "  Name: "+name+"\n";
    }
}
