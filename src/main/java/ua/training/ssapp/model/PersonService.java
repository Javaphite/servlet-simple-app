package ua.training.ssapp.model;

import java.util.LinkedList;
import java.util.List;

/**
 * Service for {@link Person} entities manipulations.
 */
public class PersonService {

    private List<Person> participants = new LinkedList<>();

    /**
     * Adds new person to storage.
     * @param person
     */
    public void addPerson(Person person) {
        participants.add(person);
    }

    private List<Person> retrievePersonList() {
        return participants;
    }

    /**
     * Returns information about all participants in text list.
     * @return list of participants
     */
    public String getParticipantsList() {
        StringBuilder result = new StringBuilder();
        retrievePersonList().forEach(result::append);

        return result.toString();
    }

    /**
     * Evaluates nearest unused id for a new {@link Person} entity.
     * @return unique unused id
     */
    public long generateId() {
        return participants.size()+1L;
    }
}
