package AtividadePilha;

public class MainDinamica {
    public static void main(String[] args) {
        PilhaDinamica pilhaDinamica = new PilhaDinamica();
        pilhaDinamica.empilhar(59);
        pilhaDinamica.empilhar(69);
        pilhaDinamica.empilhar(12);
        pilhaDinamica.exibirTodos();
        pilhaDinamica.desempilhar();
        pilhaDinamica.exibirTodos();
    }
}