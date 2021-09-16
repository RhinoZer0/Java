package classes;

/**
 *
 * @author uidj7796
 */
public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        
        person1.name = "John";
        person1.lastName = "Wick";        
        
        person1.showInformation();
        
        person2.showInformation();
        person2.name = "Lily";
        person2.lastName = "Shoes";
        person2.showInformation();
    }    
}
