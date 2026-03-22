package AtividadePilha;

public class MainSimples {
    static void main() {
        PilhaSimples pilhaSimples = new PilhaSimples(3);
        pilhaSimples.empilhar(15);
        pilhaSimples.empilhar(77);
        pilhaSimples.empilhar(23);
        pilhaSimples.desempilhar();
        pilhaSimples.exibirTodos();
    }
}