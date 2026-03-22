package AtividadePilha;
public class PilhaDinamica {
    private No topo;
    private int tamanho;

    public PilhaDinamica() {
        this.topo = null;
        this.tamanho = 0;
    }
    public void empilhar(int valor) {
        No novoNo = new No(valor);
        novoNo.proximo = topo;
        topo = novoNo;
        tamanho++;
    }
    public int desempilhar() {
        if (estaVazia()) {
            System.out.println("Sua pilha esta vazia");
            return -1;
        }
        int valor = topo.valor;
        topo = topo.proximo;
        tamanho--;
        return valor;
    }
    public void exibirTodos() {
        if (estaVazia()) {
            System.out.println("Sua pilha esta vazia");
            return;
        }
        System.out.println("A sua pilha está desta forma:");
        No atual = topo;
        while (atual != null) {
            System.out.println("[ " + atual.valor + " ]");
            atual = atual.proximo;
        }
        System.out.println("Cabo!");
    }
    public boolean estaVazia() {
        return (topo == null);
    }

    public int getTamanho() {
        return tamanho;
    }
}