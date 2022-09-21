public class Main {
    public static void main(String[] args) {
        double consumo = 12;
        double velocidadeMedia = 60;
        double tempoViagem = 1;
        double distancia = velocidadeMedia * tempoViagem;
        double consumoViagem = distancia / consumo;
        System.out.printf("DADOS DA VIAGEM\n" +
                "- Velocidade média do veiculo: %.2f.\n" +
                "- Tempo de viagem: %.1f .\n" +
                "- Distancia percorrida: %.2f.\n" +
                "- Litros consumidos na viagem: %.2f.",velocidadeMedia, tempoViagem, distancia, consumoViagem);
    }
}