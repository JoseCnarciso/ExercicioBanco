package ExercicioCadastroProduto.Heranca.DB;

import ExercicioCadastroProduto.Heranca.TipoUsuario;
import ExercicioCadastroProduto.Heranca.Usuario;

public class Admim extends Usuario {
    public Admim( String nome ) {
        super(nome, TipoUsuario.ADMIM);
    }

}
