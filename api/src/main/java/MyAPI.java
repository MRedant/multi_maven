import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;


public class MyAPI {

    public static void main(String[] args) {
        ArrayList<Person> personList =
                Lists.newArrayList(
                Arrays.asList(
                        Person.PersonBuilder.build().setName("Maarten Redant").createPerson()
                        , Person.PersonBuilder.build().setName("Davina Hesta").createPerson()));

    }

}
