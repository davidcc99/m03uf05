/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m03uf05review.exceptions;

/**
 *
 * @author david
 */
public class DividendoException extends DivisionException {

    /**
     * Creates a new instance of <code>DividendoException</code> without detail
     * message.
     */
    public DividendoException() {
    }

    /**
     * Constructs an instance of <code>DividendoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DividendoException(String msg) {
        super(msg);
    }

    public DividendoException(String message, Throwable cause) {
        super(message, cause);
    }

    public DividendoException(Throwable cause) {
        super(cause);
    }

    public DividendoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
