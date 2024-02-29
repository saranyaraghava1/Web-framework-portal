package com.example.sample.Day11.service;
import com.example.sample.Day11.model.Address;
import com.example.sample.Day11.model.Person;
import com.example.sample.Day11.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public Person getPersonById(Long id) {
        return personRepository.findById(id).orElse(null);
    }

    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    public Person updatePerson(Long id, Person person) {
        person.setId(id);
        return personRepository.save(person);
    }

    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }

    public Person assignAddressToPerson(Long personId, Address address) {
        Person person = personRepository.findById(personId).orElse(null);
        if (person != null) {
            person.setAddress(address);
            return personRepository.save(person);
        }
        return null;
    }
}

