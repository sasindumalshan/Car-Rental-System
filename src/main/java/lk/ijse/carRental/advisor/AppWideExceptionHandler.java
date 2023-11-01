package lk.ijse.carRental.advisor;

import lk.ijse.carRental.utility.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//this is also a type of aspect
//this class will handle all the runtime exceptions of the application
@RestControllerAdvice// this is an advisor which handle app wide exceptions
public class AppWideExceptionHandler {

    //if any runtime error generated inside the container object below
    //method will handle it and generate a response as we wish
    //here we have used the Response Util Class to generate a json object
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)//set status to 500
    @ExceptionHandler({RuntimeException.class})//handle the runtime exception through the below method
    public ResponseUtil handleAllRuntimeExceptions(RuntimeException e) {
        return new ResponseUtil("Error", e.getMessage(), null);
    }


}
