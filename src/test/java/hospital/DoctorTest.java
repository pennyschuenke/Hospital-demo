package hospital;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class DoctorTest {

    Doctor underTest = new Doctor("1" ,"name", "speciality");
    Patient sickPatient = new Patient();

    @Test
    public void ShouldIncreaseHealthLevelOfPatientFrom10To20WhenProvidingCare(){
       underTest.careForPatient(sickPatient);
       int patientHealthLevel = sickPatient.getHealthLevel();
       assertEquals(20,patientHealthLevel);

    }
    @Test
    public void decreaseBloodLevelFrom20To15WhenDrawingBlood(){
       underTest.bloodDraw(sickPatient);
       int patientBloodLevel = sickPatient.getBloodLevel();
       assertEquals(15,patientBloodLevel);
    }
    @Test
    public void shouldExpectASalaryOf90K(){
        int salary = underTest.calculatePay();
        assertEquals(90000, salary);
    }

}
