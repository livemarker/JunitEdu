package lesson3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {
    Developer developer=new Developer();
    DeveloperLogic devlog=new DeveloperLogic();

    @BeforeEach
    public void setUp(){
developer.setFirstName("Simple");
developer.setLastName("Developer");
developer.setSpeciality("Java");
developer.setSalary(2000);
    }

    @Test
  public void shouldCreateDevelopersInstanceTest(){
        assertEquals("Simple",developer.getFirstName());
        assertEquals("Developer",developer.getLastName());
        assertEquals("Java",developer.getSpeciality());
        assertEquals(2000,developer.getSalary());
    }
    @Test
    public void shouldCalculateAnnualSalaryTest(){
        assertEquals(24_000,devlog.calculateAnnualSalary(developer));

    }
    @Test
    public void shouldCalculateHourRateTest(){
        assertEquals(12,devlog.calculateHourRate(developer));
    }
}