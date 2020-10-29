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
public class DivisorException extends DivisionException {

    /**
     * Creates a new instance of <code>DivisorException</code> without detail
     * message.
     */
    public DivisorException() {
    }

    /**
     * Constructs an instance of <code>DivisorException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DivisorException(String msg) {
        super(msg);
    }

    public DivisorException(String message, Throwable cause) {
        super(message, cause);
    }

    public DivisorException(Throwable cause) {
        super(cause);
    }

    public DivisorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
