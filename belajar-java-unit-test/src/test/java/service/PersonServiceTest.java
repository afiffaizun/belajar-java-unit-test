package service;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import repository.PersonRepository;
import data.Person;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

    @Test
    void testGetPersonNotFound() {
        Mockito.when(personRepository.selectById(Mockito.anyString())).thenReturn(null);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            personService.get("not found");
        });
    }

    @Test
    void testGetPersonSuccess() {
        Mockito.when(personRepository.selectById("Afif")).thenReturn(new Person("Afif", "Faizun"));

        Person person = personService.get("Afif");

        Assertions.assertNotNull(person);
        Assertions.assertEquals("Afif", person); // Assert the expected name
    }
}