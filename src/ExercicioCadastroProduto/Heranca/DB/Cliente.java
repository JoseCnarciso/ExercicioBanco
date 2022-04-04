package ExercicioCadastroProduto.Heranca.DB;

import ExercicioCadastroProduto.Heranca.TipoUsuario;
import ExercicioCadastroProduto.Heranca.Usuario;

public class Cliente extends Usuario {
    public Cliente(String nome){
        super(nome, TipoUsuario.CLIENTE);
    }

}
