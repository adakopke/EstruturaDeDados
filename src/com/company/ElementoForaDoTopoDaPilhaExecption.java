package com.company;

public class ElementoForaDoTopoDaPilhaExecption extends RuntimeException {

    public ElementoForaDoTopoDaPilhaExecption() {
        super("Elemento não pode ser removido porque não está no topo da pilha.");
    }
}