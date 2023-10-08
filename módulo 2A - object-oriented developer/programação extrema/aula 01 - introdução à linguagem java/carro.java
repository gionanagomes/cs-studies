public class carro {
    private String cor;
    private int velocidadeMax;
    public String infoCarro() {
        return cor + " velocidade máxima:-" + velocidadeMax;
    }
    // esse é o construtor da classe carro
    carro(String corCarro, int limiteVelocidade) {
        this.cor = corCarro;
        this.velocidadeMax = limiteVelocidade;
    }
}
