package com.company;

public class ListaEncadeada implements EstruturaDeDados {

    private class Caixa {

        private Pessoa dados;
        private Caixa next;


        public Caixa(Pessoa pessoa) {
            this.dados = pessoa;
        }


        public Pessoa getDados() {
            return dados;
        }

        public void setDados(Pessoa dados) {
            this.dados = dados;
        }
        public Caixa getNext() {
            return next;
        }

        public void setNext(Caixa next) {
            this.next = next;
        }
    }

    private Caixa head;



    @Override
    public void adicionar(Pessoa pessoa) {
        Caixa caixa = new Caixa(pessoa);
        if (this.head == null) {
            this.head = caixa;
        } else if (this.head.getNext() == null) {
            this.head.setNext(caixa);
        } else {
            caixa.setNext(this.head.getNext());
            this.head.setNext(caixa);
        }
    }

    public void adicionarInicio(Pessoa pessoa) {
        Caixa caixa = new Caixa(pessoa);
        if (this.head != null) {
            caixa.setNext(this.head);
        }
        this.head = caixa;
    }

    public void adicionarFim(Pessoa pessoa) {
        Caixa newCaixa = new Caixa(pessoa);
        if (this.head == null) {
            this.head = newCaixa;
        } else {
            Caixa caixa = this.head;
            while (caixa.getNext() != null) {
                caixa = caixa.getNext();
            }
            caixa.setNext(newCaixa);
        }
    }

    @Override
    public void buscar(String nome) {
        Caixa caixa = this.head;
        while (caixa != null) {
            Pessoa pessoa = caixa.getDados();
            if (pessoa.getNome().equalsIgnoreCase(nome)) {
                System.out.println(pessoa);
            }
            caixa = caixa.getNext();
        }
    }

    @Override
    public void remover(Pessoa pessoa) {
        Caixa caixa = this.head;
        Caixa previous = null;
        while (caixa != null) {
            if (caixa.getDados().equals(pessoa)) {
                if (previous == null) {
                    this.head = this.head.getNext();
                } else {
                    previous.setNext(caixa.getNext());
                }
                break;
            }
            previous = caixa;
            caixa = caixa.getNext();
        }
    }

    @Override
    public void remover(int index) {
        Pessoa pessoa = this.getPessoa(index);
        this.remover(pessoa);
    }

    @Override
    public void listarTodos() {
        isEmpty();
        Caixa caixa = this.head;
        while (caixa != null) {
            System.out.println(caixa.getDados());
            caixa = caixa.getNext();
        }
    }

    @Override
    public Pessoa getPessoa(int index) {
        int cont = 0;
        Caixa caixa = this.head;
        while (caixa != null) {
            if (cont++ == index) {
                return caixa.getDados();
            }
            caixa = caixa.getNext();
        }
        return null;
    }

    public void isEmpty() {
        if (this.head == null) {
            throw new ListaVaziaException();
        }
    }


}