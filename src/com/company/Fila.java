package com.company;

import java.util.Arrays;

public class Fila implements EstruturaDeDados {

    private int primeiroDaFila = 0;
    private int ultimoDaFila = 0;
    private int tamanhoFila = 0;
    private Pessoa[] elementos = new Pessoa[4];

    @Override
    public void adicionar(Pessoa pessoa) {
        isFull();
        this.elementos[ultimoDaFila] = pessoa;
        this.tamanhoFila++;
        this.ultimoDaFila = (ultimoDaFila + 1) % this.elementos.length;

    }

    public void remover() {
        isEmpty();
        this.elementos[primeiroDaFila] = null;
        this.primeiroDaFila = (this.primeiroDaFila + 1) % this.elementos.length;
        this.tamanhoFila--;
    }

    @Override
    public void buscar(String nome) {
        for (Pessoa pessoa : elementos) {
            if (pessoa != null && pessoa.getNome().equalsIgnoreCase(nome)) {
                System.out.println(pessoa.getNome());
                return;
            }

        }
        System.out.println("Pessoa não está na lista");
    }

    @Override
    public void remover(Pessoa pessoa) {
    isEmpty();
    if (this.elementos[primeiroDaFila].equals(pessoa)) {
        remover();
        return;
    }
    throw new ElementoNaoRepresentaInicioFila();
    }

    @Override
    public void remover(int index) {
    isEmpty();
    if (this.elementos[index] != null && this.elementos[index].equals(this.elementos[this.primeiroDaFila])) {
        remover();
        return;
    }
    throw new ElementoNaoRepresentaInicioFila();
    }

    @Override
    public void listarTodos() {
        isEmpty();
        for (Pessoa pessoa : elementos) {
            if (pessoa != null) {
                System.out.println(pessoa);
            }
        }
    }

    @Override
    public Pessoa getPessoa(int index) {
        if (this.elementos[index] != null) {
            return this.elementos[index];
        }
        throw new ElementoNaoEncontradoException();
    }

    public void isEmpty() {
        if (this.tamanhoFila == 0) {
            throw new FilaVaziaException();
        }
    }

    public void isFull() {
        if (this.tamanhoFila == this.elementos.length) {
            throw new FilaCheiaExecption();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fila fila = (Fila) o;
        return Arrays.equals(elementos, fila.elementos);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(elementos);
    }

    @Override
    public String toString() {
        return "Fila{" +
                "primeiroDaFila=" + primeiroDaFila +
                ", ultimoDaFila=" + ultimoDaFila +
                ", tamanhoFila=" + tamanhoFila +
                ", elementos=" + Arrays.toString(elementos) +
                '}';
    }
}
