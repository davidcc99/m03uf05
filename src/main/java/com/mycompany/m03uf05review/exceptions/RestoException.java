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
public class RestoException extends DivisionException {

    /**
     * Creates a new instance of <code>RestoException</code> without detail
     * message.
     */
    public RestoException() {
    }

    /**
     * Constructs an instance of <code>RestoException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public RestoException(String msg) {
        super(msg);
    }

    public RestoException(String message, Throwable cause) {
        super(message, cause);
    }

    public RestoException(Throwable cause) {
        super(cause);
    }

    public RestoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
