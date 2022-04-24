
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        return this.persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        // return a null reference if there's no one on the ride
        if (this.persons.isEmpty()) {
            return null;
        }

        // create an object reference for the object to be returned
        // its first value is the first object on the list
        Person shortest = this.persons.get(0);

        // go through the list
        for (Person person : this.persons) {
            // compare each object on the list
            // to the returnObject -- we compare heights
            // since we're searching for the shortest,

            if (shortest.getHeight() > person.getHeight()) {
                // if we find a taller person in the comparison,
                // we assign it as the value of the returnObject
                shortest = person;
            }
        }

        // finally, the object reference describing the
        // return object is returned
        return shortest;
    }

    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person shortest = this.shortest();
        
        this.persons.remove(shortest);
        
        return shortest;
    }
}
