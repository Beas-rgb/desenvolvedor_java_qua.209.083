import javax.swing.JOptionPane;
import models.Pessoa;
import models.Cnpj;

public class App {

    public static void main(String[] args) {

        // Escolha do tipo de cadastro
        String[] opcoes = {"Pessoa Física", "Pessoa Jurídica"};

        int escolha = JOptionPane.showOptionDialog(
                null,
                "Escolha o tipo de cadastro:",
                "Cadastro",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );

        // Se fechou a janela
        if (escolha == -1) {
            JOptionPane.showMessageDialog(null, "Cadastro cancelado.");
            return;
        }

        // CADASTRO PESSOA FÍSICA
        if (escolha == 0) {

            Pessoa pessoa = new Pessoa();

            pessoa.setNome(JOptionPane.showInputDialog("Digite o nome:"));
            pessoa.setSobrenome(JOptionPane.showInputDialog("Digite o sobrenome:"));
            pessoa.setDataNascimento(JOptionPane.showInputDialog("Digite a data de nascimento (dd/mm/aaaa):"));
            pessoa.setCpf(JOptionPane.showInputDialog("Digite o CPF:"));

            pessoa.setEmail(JOptionPane.showInputDialog("Digite o email:"));
            pessoa.setTelefone(JOptionPane.showInputDialog("Digite o telefone:"));

            String mensagem =
                    "===== DADOS DA PESSOA FÍSICA =====\n" +
                    "ID: " + pessoa.getIdUsuario() + "\n" +
                    "Nome: " + pessoa.getNome() + " " + pessoa.getSobrenome() + "\n" +
                    "Data de Nascimento: " + pessoa.getDataNascimento() + "\n" +
                    "CPF: " + pessoa.getCpf() + "\n" +
                    "Email: " + pessoa.getEmail() + "\n" +
                    "Telefone: " + pessoa.getTelefone();

            JOptionPane.showMessageDialog(null, mensagem);
        }

        // CADASTRO PESSOA JURÍDICA
        else {

            Cnpj empresa = new Cnpj();

            empresa.setRazaoSocial(JOptionPane.showInputDialog("Digite a razão social:"));
            empresa.setNomeFantasia(JOptionPane.showInputDialog("Digite o nome fantasia:"));
            empresa.setCnpj(JOptionPane.showInputDialog("Digite o CNPJ:"));

            empresa.setEmail(JOptionPane.showInputDialog("Digite o email:"));
            empresa.setTelefone(JOptionPane.showInputDialog("Digite o telefone:"));

            String mensagem =
                    "===== DADOS DA PESSOA JURÍDICA =====\n" +
                    "ID: " + empresa.getIdUsuario() + "\n" +
                    "Razão Social: " + empresa.getRazaoSocial() + "\n" +
                    "Nome Fantasia: " + empresa.getNomeFantasia() + "\n" +
                    "CNPJ: " + empresa.getCnpj() + "\n" +
                    "Email: " + empresa.getEmail() + "\n" +
                    "Telefone: " + empresa.getTelefone();

            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
}