
public class Item {

    private String id;
    private String name;

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    
    @Override
    public boolean equals(Object obj) {
        // if the variables are located in the same position, they are equal
        if (this == obj) {
            return true;
        }

        // if the compared object is not of type Bird, the objects are not equal
        if (!(obj instanceof Item)) {
            return false;
        }

        // convert the object to a Bird object
        Item comparedItem = (Item) obj;

        // if the values of the object variables are equal, the objects are, too
        return this.id.equals(comparedItem.id);
    }

    @Override
    public String toString() {
        return this.id + ": " + this.name;
    }
    
    
    

}
