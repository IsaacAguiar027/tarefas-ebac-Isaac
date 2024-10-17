/**
 * @author isaac.aguiar
 */
public class PrimeiraClasse {
    public static void main(String[] args) {
        // Criando um objeto garrafa
        Garrafa minhaGarrafa = new Garrafa("Plástico", "Azul", 1.5);

        // Exibindo as informações da garrafa
        minhaGarrafa.mostrarInfo();

        // Enchendo a garrafa
        minhaGarrafa.encher(1.0);

        // Bebendo da garrafa
        minhaGarrafa.beber(0.5);

        // Exibindo o estado atualizado da garrafa
        minhaGarrafa.mostrarInfo();
    }
}

