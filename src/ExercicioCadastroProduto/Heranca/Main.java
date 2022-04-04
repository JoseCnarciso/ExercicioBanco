package ExercicioCadastroProduto.Heranca;

import ExercicioCadastroProduto.Heranca.DB.Admim;
import ExercicioCadastroProduto.Heranca.DB.Cliente;
import ExercicioCadastroProduto.Heranca.DB.ProdutosDB;
import ExercicioCadastroProduto.Heranca.DB.UsuariosDB;
import ExercicioCadastroProduto.Heranca.Produto;
import ExercicioCadastroProduto.Heranca.Usuario;



import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;
import  java.util.Date;
public class Main {
    static ProdutosDB produtosDB = new ProdutosDB();
    static UsuariosDB usuariosDB = new UsuariosDB();

    public static void main( String[] args ) throws Exception {
        System.out.println("================Pedidos de vendas =================");
        int opc;

        do {
            System.out.println(" 1 Cadastrar novo produto: ");
            System.out.println(" 2 Listar produtos cadastrados: ");
            System.out.println(" 3 Cadastrar Administrador: ");
            System.out.println(" 4 Cadastrar Cliente: ");
            System.out.println(" 5 Listar todos os usuários cadastrados:  ");
            System.out.println(" 0 Sair");
            Scanner scanner = new Scanner(System.in);
            opc = scanner.nextInt();

            System.out.println("Qual a opção deseja realizar: ");

            process(opc);
        } while (opc != 0);

    }

    public static void process( int opc ) throws Exception {
        switch (opc) {
            case 1: {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Qual a descrição deseja dar ao produto: ");
                String descricao = scanner.nextLine();

                System.out.println("Qual ID você deseja cadastrar ao novo produto: ");
                int id = scanner.nextInt();
                System.out.println("Preço do produto: ");
                double preco = scanner.nextDouble();

                System.out.println("Data do cadastro: ");
                String dataString = scanner.next();
                Date dataCadastro = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);


                Produto novoProduto = new Produto(id, descricao, preco, dataCadastro);

                produtosDB.addNovoProduto(novoProduto);


                break;
            }
            case 2: {
                List<Produto> listaprodutos = produtosDB.getProdutosList();

                for (Produto produto : listaprodutos) {

                    System.out.println("----------------------------");
                    System.out.println("Id: " + produto.getId());
                    System.out.println("Descrição: " + produto.getDescricao());
                    System.out.println("Preço: " + produto.getPreco());
                    System.out.println("Data de lançamento: " + produto.getDataCadstro());

                    System.out.println("------------------------------------------");

                }
                break;
            }
            case 3: {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Qual o nome do Usuári ADMINISTRADOR: ");
                String nome = scanner.nextLine();
                Admim novoAdmim = new Admim(nome);
                usuariosDB.addNovoUsuario(novoAdmim);

            break;
            }


            case 4: {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Qual o nome do cliente : ");
                String nome = scanner.nextLine();
                // Instancia-se o novo objeto (novoCliente)
                Cliente novoCliente = new Cliente(nome);
                // O banco de dados é o objeto usuariosDB
                usuariosDB.addNovoUsuario(novoCliente);
                break;
            }


            case 5: {
                System.out.println("========================================================");
                System.out.println("<<<<<<<<LISTA DE USUÁRIOS CADASTRADOS >>>>>>>>");
                for (Usuario usuario : usuariosDB.getUsuarioList() ){
                    System.out.println(" ID " + usuario.getId());
                    System.out.println(" NOME " + usuario.getNome());
                    System.out.println(" TIPO " + usuario.getTipoUsuario());


                }
                break;
            }

        }
    }
}
