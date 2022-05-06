package hospital;

public class Doctor extends HospitalEmployee implements MedicalDuties {
    private String speciality;

    public Doctor(String employeeNumber, String name, String speciality) {
        super(employeeNumber, name);
        this.speciality = speciality;


    }

    @Override
    public void careForPatients(Patient sickPatient) { sickPatient.increaseHealthLevel(10);

    }

    @Override
    public void careForPatient(Patient sickPatient) {


    }


    @Override
    public void bloodDraw(Patient sickPatient) {
        sickPatient.decreaseBloodLevel(5 );
    }

    @Override
    public int calculatePay() {
        return 90000;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "speciality='" + speciality + '\'' +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

