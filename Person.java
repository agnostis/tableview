import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

    private StringProperty name;

    public Person (){

    }

    public Person (String name){
        this.name = new SimpleStringProperty(name);
    }


    public String getName (){
        return name.get();
    }

    public void setName(String name){
        this.name.set(name);
    }
}
