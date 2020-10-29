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
public class DivisionException extends Exception {

    /**
     * Creates a new instance of <code>DivisionException</code> without detail
     * message.
     */
    public DivisionException() {
    }

    /**
     * Constructs an instance of <code>DivisionException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DivisionException(String msg) {
        super(msg);
    }

    public DivisionException(String message, Throwable cause) {
        super(message, cause);
    }

    public DivisionException(Throwable cause) {
        super(cause);
    }

    public DivisionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
