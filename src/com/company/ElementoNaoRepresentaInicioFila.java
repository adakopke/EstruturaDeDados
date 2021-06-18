package com.company;

public class ElementoNaoRepresentaInicioFila extends RuntimeException {
    public ElementoNaoRepresentaInicioFila() {
        super ("Elemento não é o primeiro da fila e não pode ser removido prioritariamente");
    }
}
