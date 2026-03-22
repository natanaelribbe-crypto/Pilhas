package AtividadePilha;
public class PilhaSimples{
    private int[] elemento;
    private int topo;
    public PilhaSimples(int tamanho) {
        while (tamanho < 0){
            System.out.println("O tamanho de sua pilha é invalido!");
        }
        elemento=new int[tamanho];
        topo = -1;
    }
    public void empilhar(int valor) {
        if (topo < elemento.length - 1) {
            topo++;
            elemento[topo] = valor;
        } else {
            System.out.println("A sua pilha já esta cheia!");
        }
    }
    public int desempilhar() {
        if (topo >= 0) {
            int valor = elemento[topo];
            topo-= 1;
            return valor;
        } else {
            System.out.println("Sua pilha está vazia !");
            return -1;
        }
    }
    public void exibirTodos() {
        if (topo == -1) {
            System.out.println("Sua pilha está vazia ");
        } else {
            System.out.println("Sua pilha é");
            for (int i = topo; i >= 0; i--) {
                System.out.println(elemento[i]);
            }
        }
    }
    public boolean estaVazia() {
        return (topo == -1);
    }
}