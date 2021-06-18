package com.company;

public class Pilha implements EstruturaDeDados {

    private Pessoa[] elementos = new Pessoa[4];
    private int head = -1;

    public void adicionar(Pessoa elemento)  {
            isFull();
            this.head++;
            this.elementos[this.head] = elemento;

    }

    public void remover() {
           isEmpty();
            this.elementos[this.head] = null;
            this.head--;

    }

    private void isEmpty() {
        if (this.head == -1) {
            throw new PilhaVaziaException();
        }
    }


    private void isFull() {
            if (this.head == (this.elementos.length - 1)) {
                throw new PilhaCheiaExecption();
            }
        }


    public void listarTodos() {
            isEmpty();
            for (int i = this.head; i >= 0; i--) {
                System.out.println(this.elementos[i]);

            }
        }

    @Override
    public Pessoa getPessoa(int index) {
        return this.elementos[index];
    }


    @Override
    public void buscar(String nome) {
        for (int i = 0; i <= this.head; i++) {
            if (this.elementos[i].getNome().equalsIgnoreCase(nome)) {
                System.out.println(this.elementos[i].getNome());
                return;
        }
        }
        throw new ElementoNaoEncontradoException();
    }


    @Override
    public void remover(Pessoa pessoa) {
          isEmpty();
          for (int i = 0; i <= this.head; i++) {
              if (this.elementos[i].equals(pessoa) && this.elementos[i].equals(this.elementos[this.head])) {
                 remover();
                 return;
              }
          }
          throw new ElementoForaDoTopoDaPilhaExecption();
    }

    @Override
    public void remover(int index) {
        if (this.elementos[index].equals(this.elementos[this.head])) {
            remover();
        } else {
            throw new ElementoForaDoTopoDaPilhaExecption();
        }

    }



}

