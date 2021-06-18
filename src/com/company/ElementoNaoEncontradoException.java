package com.company;

public class ElementoNaoEncontradoException extends RuntimeException {
    public ElementoNaoEncontradoException() {
        super ("Elemento não encontrado");
    }
}
