package ua.training.sbt.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.training.sbt.model.Person;
import ua.training.sbt.model.PersonService;

@Configuration
public class BeanConfiguration {

    @Bean
    public PersonService personService() {
        PersonService service = new PersonService();

        // Initial content of service's storage
        service.addPerson(new Person(1, "Ivan", "Petrov", "MegaSoft Ltd.", "ORGANIZATOR"));
        service.addPerson(new Person(2, "Viktoriia", "Marchuk", "---", "VOLUNTEER"));

        return service;
    }
}
