package sv.edu.ufg.CINEMA.exception;

//@ResponseStatus(HttpStatus.NOT_FOUND)
public class ModelNotFoundException extends RuntimeException {

    public ModelNotFoundException(String msg){
        super(msg);
    }
}
