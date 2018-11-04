package ua.training.ssapp.model;

import java.util.LinkedList;
import java.util.List;

/**
 * Service for {@link Person} entities manipulations.
 */
public final class PersonService {

    private static final PersonService INSTANCE = new PersonService();

    private List<Person> participants;

    private PersonService() {
        participants = new LinkedList<>();
    }

    public static PersonService getInstance() {
        return INSTANCE;
    }

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
