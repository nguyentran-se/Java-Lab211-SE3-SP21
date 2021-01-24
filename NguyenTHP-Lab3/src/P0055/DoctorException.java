package P0055;

public class DoctorException extends Exception{

    public DoctorException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage(); 
    }
}
