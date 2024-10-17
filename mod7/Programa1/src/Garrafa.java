/**
 * @author isaac.aguiar
 */

// Classe que representa uma garrafa no mundo real
public class Garrafa {

    // Propriedades da garrafa com modificadores de acesso
    private String material;       // Somente acessível dentro da classe Garrafa
    private String cor;            // Somente acessível dentro da classe Garrafa
    private double capacidade;     // Somente acessível dentro da classe Garrafa
    private double quantidadeAtual;// Somente acessível dentro da classe Garrafa

    // Construtor da classe Garrafa
    public Garrafa(String material, String cor, double capacidade) {
        this.material = material;
        this.cor = cor;
        this.capacidade = capacidade;
        this.quantidadeAtual = 0; // Iniciando com a garrafa vazia
    }

    // Método público para encher a garrafa
    public void encher(double quantidade) {
        if (quantidadeAtual + quantidade <= capacidade) {
            quantidadeAtual += quantidade;
            System.out.println("A garrafa foi enchida com " + quantidade + " litros.");
        } else {
            System.out.println("Não é possível encher a garrafa com essa quantidade. Excede a capacidade.");
        }
    }

    // Método público para beber da garrafa
    public void beber(double quantidade) {
        if (quantidadeAtual >= quantidade) {
            quantidadeAtual -= quantidade;
            System.out.println("Você bebeu " + quantidade + " litros.");
        } else {
            System.out.println("Não há líquido suficiente na garrafa para beber.");
        }
    }

    // Método público para mostrar o estado atual da garrafa
    public void mostrarInfo() {
        System.out.println("Material: " + material);
        System.out.println("Cor: " + cor);
        System.out.println("Capacidade: " + capacidade + " litros.");
        System.out.println("Quantidade atual de líquido: " + quantidadeAtual + " litros.");
    }

    // Método privado para uso interno, que calcula o espaço livre na garrafa
    private double calcularEspacoLivre() {
        return capacidade - quantidadeAtual;
    }
}
