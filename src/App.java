

public class App {
    public static void main(String[] args) throws Exception {
        runArbolBinario();
    }

    public static void runArbolBinario(){
        ArbolBinario arbol = new ArbolBinario();

        int [] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};
        
        for (int valor : valores) {
            arbol.insert(valor);
        }

        System.out.println("Arbol:");
        arbol.printTree();
    }
}
