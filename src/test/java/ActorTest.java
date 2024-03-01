import org.example.Actor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class ActorTest {
    @Test
    @DisplayName("Sprawdzam czy liczy dobrze")
    public void shouldCalculateSalaryCorrectly(){
        int expectedSalary = 3000;
        int actualSalary;
        Actor actor1 = new Actor("Bogusław", "Linda", 10, false);
        actualSalary = actor1.calculateSalary(3,1000);

        //do testów potrzeba w pom.xml dodać <dependencies> i dodać <dependency> z JUnit i assertJ
        //asercja jest zawsze ostatnią linijką kodu w teście.
        //jedna asercja na jeden test (nie mozna robić wielu asercji na jeden test).
        assertThat(expectedSalary).isEqualTo(actualSalary);
        System.out.println("Koniec testu");
    }

    @Test
    public void shouldCalculateSalary1(){
        int expectedSalary = 4000;
        int actualSalary;
        Actor actor1 = new Actor("Bogusław", "Linda", 10, false);
        actualSalary = actor1.calculateSalary(3,1000);

        //do testów potrzeba w pom.xml dodać <dependencies> i dodać <dependency> z JUnit i assertJ
        //asercja jest zawsze ostatnią linijką kodu w teście.
        //jedna asercja na jeden test (nie mozna robić wielu asercji na jeden test).
        assertThat(expectedSalary).isGreaterThan(actualSalary);
        System.out.println("Koniec testu");
    }

    @Test
    @DisplayName("Sprawdzam czy ustawa kominowa jest zachowana")
    public void shouldCalculateSalaryCorrectly1(){
        System.out.println("test 2");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/login.csv")
    @DisplayName("Logowanie prawidłowego usera")
    public void shouldLoginProperly(String login, String password){
        System.out.println("Login: " + login);
        System.out.println("Password: " + password);
        System.out.println("Login properly");
    }

}
