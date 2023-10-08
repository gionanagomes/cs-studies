public class carro01 {
    public static void main(String[] args) {
        carro maruti = new carro("vermelho", 160);
        carro ferrari = new carro("amarelo", 400);
        System.out.println(maruti.infoCarro());
        System.out.println(ferrari.infoCarro());
    }
}
