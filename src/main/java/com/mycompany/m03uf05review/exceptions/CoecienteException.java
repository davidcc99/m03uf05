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
public class CoecienteException extends DivisionException {

    /**
     * Creates a new instance of <code>CoecienteException</code> without detail
     * message.
     */
    public CoecienteException() {
    }

    /**
     * Constructs an instance of <code>CoecienteException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CoecienteException(String msg) {
        super(msg);
    }

    public CoecienteException(String message, Throwable cause) {
        super(message, cause);
    }

    public CoecienteException(Throwable cause) {
        super(cause);
    }

    public CoecienteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
