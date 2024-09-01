package com.ericsson.sm.CarApp.validation;

import com.ericsson.sm.CarApp.exception.GenericValidationException;
import com.ericsson.sm.CarApp.model.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientValidation {
    public void validate(Client client){
        if(client.getFirstName().isBlank()){
            throw new GenericValidationException("First name is blank");
        }
        if(client.getLastName().isBlank()){
            throw new GenericValidationException("Last name is blank");
        }
        validateOib(client.getOib());


    }

    private void validateOib(String oib) {
        if (oib.isBlank()) {
            throw new GenericValidationException("OIB is blank");
        }

        int validationResult = OibValidation.checkOIBState(oib);
        switch (validationResult) {
            case OibValidation.ERR_INVALID_LENGTH:
                throw new GenericValidationException("OIB length is incorrect");
            case OibValidation.ERR_INVALID_FORMAT:
                throw new GenericValidationException("OIB format is incorrect");
            case OibValidation.ERR_INVALID_CONTROL:
                throw new GenericValidationException("OIB control digit is incorrect");
            case OibValidation.NO_ERROR:
                break;
            default:
                throw new GenericValidationException("Unknown error during OIB validation");
        }
    }

}
