package data;

public class Person {
    private String id;
    private String name;

    public Person() {
        this(null, null);
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return (id != null ? id.equals(person.id) : person.id == null) &&
               (name != null ? name.equals(person.name) : person.name == null);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person {" +
               "id='" + id + '\'' +
               ", name='" + name + '\'' +
               '}';
    }
}
