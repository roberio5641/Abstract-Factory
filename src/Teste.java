public class Teste {
    public static void main(String[] args) {
        Carros fabrica = new FabricaCarro();
        CarroSedan sedan = fabrica.criarCarroSedan();
        CarroPopular popular = fabrica.criarCarroPopular();
        sedan.exibirInfoSedan();
        System.out.println();
        popular.exibirInfoPopular();
        System.out.println();


    }
}
