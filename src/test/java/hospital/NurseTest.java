package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NurseTest {


    Nurse underTest = new Nurse("1","name",5 );
    Patient sickPatient = new Patient();


    @Test
    public void shouldIncreaseHealthlevelFrom10To15WhenCaringForPatient(){
     underTest.careForPatients(sickPatient);
     int healthLevel = sickPatient.getHealthLevel();
     assertEquals(15,healthLevel);

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
        assertEquals(80000, salary);
    }



}
