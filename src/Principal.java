
import javax.swing.JOptionPane;

/**
 * @author Alunos
 */
public class Principal {

    public static void main(String[] args) {

        Pessoa lucas = new Pessoa();
        lucas.nome = "Lucas";
        lucas.idade = 16;
        lucas.peso = 94.0f;
        lucas.altura = 1.94f;
        lucas.sexo = 'm';
        lucas.cpf = "123.456.789-12";
        lucas.sobrenome = "Rodrigo";

        Pessoa carlos = new Pessoa();
        carlos.idade = 18;
        carlos.peso = 78;
        carlos.sexo = 'm';
        carlos.cpf = "987.654.321-98";
        carlos.nome = "Carlos";
        carlos.sobrenome = "Augusto";
        carlos.altura = 1.78f;

        JOptionPane.showMessageDialog(null, lucas.toString());

        JOptionPane.showMessageDialog(null, carlos);
    }

}
