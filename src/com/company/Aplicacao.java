package com.company;

public class Aplicacao {

    public static void main(String[] args) {
        /* Base para testes com pilha, fila e lista encadeada */
        var pessoa1 = new Pessoa("Anderson");
        var pessoa2 = new Pessoa("Evelyn");
        var pessoa3 = new Pessoa("Penelope");
        var pessoa4 = new Pessoa("Charlotte");
        var pessoa5 = new Pessoa("Pow");


        /* Testes com lista encadeada: Criar */
        ListaEncadeada l1 = new ListaEncadeada();

        /* Tentar exibir a lista com ela vazia */
        //l1.listarTodos();

        /* Adicionar elementos na lista */
        l1.adicionar(pessoa1); //Anderson
        l1.adicionar(pessoa2); //Evelyn
        l1.adicionar(pessoa3); //Penelope
        l1.adicionarInicio(pessoa5); //Pow deve ser adicionado no início
        l1.adicionarFim(pessoa4); //Charlotte deve ser adicionada no fim

        /* Listar todos */
        l1.listarTodos();
        System.out.println();

        /* Buscar pessoa */
        l1.buscar("Pow");
        System.out.println();

        /* Testar getPessoa */
        System.out.println(l1.getPessoa(2)); //Penelope
        System.out.println();

        /* Remover pelo indice */
        l1.remover(2); //Penelope
        l1.listarTodos();
        System.out.println();

        /* Remover pessoa */
        l1.remover(pessoa2); //Evelyn
        l1.listarTodos();



        /* Testes com fila: Criar */
        //Fila f1 = new Fila();

        /* Listar toda a fila com ela vazia */
        //f1.listarTodos();

        /* Retirar com a fila vazia */
        //f1.remover();

        /* Adicionar elementos na fila */
        //f1.adicionar(pessoa1); //Anderson
        //f1.adicionar(pessoa2); //Evelyn
        //f1.adicionar(pessoa3); //Penelope

        /* Sequência de testes para validar manipulação da fila */
        //f1.remover(); // Sairá Anderson
        //f1.adicionar(pessoa4); //Entrará Charlotte no fim da fila
        //f1.remover(); //Sairá Evelyn
        //f1.remover(); //Sairá Penelope restando apenas Charlotte na fila
        //f1.adicionar(pessoa5); //Adicionar Pow no fim da fila (será usado nos testes seguintes para testar remoções)
        //f1.listarTodos();
        //System.out.println();

        /* Deixar trecho acima descomentado para testes com remoção da fila composta por Charlotte e Pow) */

        /* Tentar remover por índice */
        //f1.remover(1);

        /* Tentar remover por pessoa */
        //f1.remover(pessoa4);  //pessoa4 tem de funcionar, pessoa5 não.
        //f1.listarTodos();

        /* Buscar por nome */
        //f1.buscar("Pow");


        /* Testar método getPessoa */
        //System.out.println(f1.toString());
        //System.out.println(f1.getPessoa(0));





        /* Testes com pilha: Criar */
        //var p1 = new Pilha();

        /* Listar toda a pilha com ela vazia */
        //p1.listarTodos();

        /* Retirar o head da pilha com ela vazia */
        //p1.remover();

        /* Adicionar elementos na pilha */
        //p1.adicionar(pessoa1); //Anderson
        //p1.adicionar(pessoa2); //Evelyn
        //p1.adicionar(pessoa3); //Penelope
        //p1.adicionar(pessoa4); //Charlotte

        /* Tentar adicionar um elemento na pilha cheia */
        //p1.adicionar(pessoa5);

        /* Listar todos */
        //p1.listarTodos();

        /* Remover topo da pilha */
        //p1.remover();
        //p1.listarTodos();

        /* Testar getPessoa */
        //System.out.println(p1.getPessoa(2));

        /* Buscar por nome */
        //p1.buscar("Charlotte");

        /* Tentar remover pessoa que não é o topo da pilha */
        //p1.remover(pessoa1);

        /* Remover pessoa que não é o topo da pilha */
        //p1.remover(pessoa4);
        //p1.listarTodos();

        /* Remover pelo índice */
        //p1.remover(2);
        //p1.listarTodos();



    }
}
