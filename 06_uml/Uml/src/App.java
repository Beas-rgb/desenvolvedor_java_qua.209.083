import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {

        // ===== CADASTRO =====
        long id = System.currentTimeMillis(); // ID automático

        String nome = JOptionPane.showInputDialog("Informe seu nome:");
        String data = JOptionPane.showInputDialog("Informe a sua data de nascimento:");
        String email = JOptionPane.showInputDialog("Informe o seu email:");
        String senhaCadastrada = JOptionPane.showInputDialog("Crie uma senha:");

        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

        // ===== LOGIN =====
        String nomeLogin = JOptionPane.showInputDialog("Digite seu nome para login:");
        String senhaLogin = JOptionPane.showInputDialog("Digite sua senha:");

        // ===== VERIFICAÇÃO =====
        if(nomeLogin.equals(nome) && senhaLogin.equals(senhaCadastrada)) {

            JOptionPane.showMessageDialog(null, 
                "Login realizado com sucesso!\n\n" +
                "===== DADOS DO USUÁRIO =====\n" +
                "ID: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Data de Nascimento: " + data + "\n" +
                "Email: " + email
            );

            System.out.println("Login realizado com sucesso!");

            System.out.println("===== DADOS DO USUÁRIO =====");
            System.out.println("ID: " + id);
            System.out.println("Nome: " + nome);
            System.out.println("Data de Nascimento: " + data);
            System.out.println("Email: " + email);

            // deseija continuar ou sair
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Continuar", JOptionPane.YES_NO_OPTION);    
            if(resposta == JOptionPane.YES_OPTION) {
                System.out.println("Usuário escolheu continuar.");
            } else {
                
                System.out.println("Usuário escolheu sair.");
                JOptionPane.showMessageDialog(null, "Obrigado por usar o sistema!");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Nome ou senha incorretos!");
            System.out.println("Login inválido!");
        }
    }
}