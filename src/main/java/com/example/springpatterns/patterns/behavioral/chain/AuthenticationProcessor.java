package com.example.springpatterns.patterns.behavioral.chain;

/**
 * Chain design pattern
 */
public abstract class AuthenticationProcessor {


    protected AuthenticationProcessor next;

    protected AuthenticationProcessor(AuthenticationProcessor next) {
        this.next = next;
    }

    /**
     * Comprueba mecanismo de autenticación
     * @param provider proveedor de autenticación
     * @return verdadero si está autorizado
     */
    public abstract boolean isAuthorized(AuthenticationProvider provider);

    public AuthenticationProcessor getNext() {
        return next;
    }

    public void setNext(AuthenticationProcessor next) {
        this.next = next;
    }
}
