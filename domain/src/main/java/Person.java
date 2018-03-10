public class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public static class PersonBuilder {
        private String name;

        public static PersonBuilder build(){
            return new PersonBuilder();
        }

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public Person createPerson() {
            return new Person(name);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
