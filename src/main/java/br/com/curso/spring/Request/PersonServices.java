package br.com.curso.spring.Request;

import br.com.curso.spring.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id) {
        logger.info("Findng one Person!");
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirsName("João");
        person.setLastName("Moreira");
        person.setAddress("São Paulo - São Paulo - Brasil");
        person.setGender("male");
        return  person;
    }

    public Person create(Person p) {
        logger.info("Creating one Person!");
        return p;
    }


    public Person update(Person p) {
        logger.info("Updating one Person!");
        return p;
    }

    public void delete(String id) {
        logger.info("Deleting one Person!");
    }


    public List<Person> findAll() {
        logger.info("Findng one People!");
        List<Person> persons = new ArrayList<Person>();
        for (int i  = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);

        }
        return persons;
    }



    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirsName("Fist Name " + i);
        person.setLastName("Last Name " + i);
        person.setAddress("Some adress " + i);
        if (i % 2 == 0) {
            person.setGender("male");
        } else {
            person.setGender("famele");
        }

        return person;
    }

}
