package com.sve;

public class ErrorHandling {

    public Double stringToDoubleHandle(String value) {

        try {
            return Double.parseDouble(value);
        }
        catch (NumberFormatException ex) {
            //TODO: Implement error dialog
            throw ex;
        }
    }
}