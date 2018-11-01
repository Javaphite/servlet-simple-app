package ua.training.ssapp.controller;

import ua.training.ssapp.model.Person;
import ua.training.ssapp.model.PersonService;

public class ConferenceRegistrationController {

    /*static final String INDEX = "/";
    static final String REGISTER_PERSON_ENDPOINT = "/registerPerson";
    static final String MAIN_PAGE = "welcome";
    static final String REGISTRATION_FORM_ENDPOINT = "registerPerson";

    @Autowired
    private PersonService service;

    @GetMapping(INDEX)
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView(MAIN_PAGE);
        modelAndView.addObject("participants", service.getParticipantsList());
        return modelAndView;
    }

    @GetMapping(REGISTER_PERSON_ENDPOINT)
    public String getRegisterPerson() {
        return REGISTRATION_FORM_ENDPOINT;
    }

    @PostMapping(REGISTER_PERSON_ENDPOINT)
    public String setRegisterPerson(@RequestParam("firstName") String firstName,
                                        @RequestParam("lastName") String lastName,
                                        @RequestParam("company") String company,
                                        @RequestParam("accessLevel") String accessLevel) {
        long id = service.generateId();
        service.addPerson(new Person(id, firstName, lastName, company, accessLevel));
        return "redirect:" + INDEX;
    }*/
}
