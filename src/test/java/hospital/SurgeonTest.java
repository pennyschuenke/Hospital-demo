package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SurgeonTest {

    Surgeon underTest = new Surgeon("1", "name", "speciality", true);
    Patient sickPatient = new Patient();


    @Test
    public void shouldIncreaseHeathLevelFrom10To20WhenCaringForPatient() {
        underTest.careForPatient(sickPatient);
        int healthLevel = sickPatient.getHealthLevel();
        assertEquals(20, healthLevel);

    }
    @Test
    public void decreaseBloodLevelFrom20To15WhenDrawingBlood(){
        underTest.bloodDraw(sickPatient);
        int patientBloodLevel = sickPatient.getBloodLevel();
        assertEquals(15,patientBloodLevel);
    }
    @Test
    public void shouldExpectASalaryOf100K(){
        int salary = underTest.calculatePay();
        assertEquals(100000, salary);
    }

}
