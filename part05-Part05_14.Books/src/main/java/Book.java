
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object obj) {
        // if the variables are located in the same position, they are equal
        if (this == obj) {
            return true;
        }

        // if the compared object is not of type Bird, the objects are not equal
        if (!(obj instanceof Book)) {
            return false;
        }

        // convert the object to a Bird object
        Book comparedBook = (Book) obj;

        // if the values of the object variables are equal, the objects are, too
        return this.name.equals(comparedBook.name)
                && this.publicationYear == comparedBook.publicationYear;

    }

}
