package ExercicioCadastroProduto.Heranca;

import java.util.Date;

public class Produto {
    private int id;
    private String descricao;
    private double preco;
    private Date dataCadastro;

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao( String descricao ) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco( double preco ) {
        this.preco = preco;
    }

    public Date getDataCadstro() {
        return dataCadastro;
    }

    public void setDataCadastro( Date dataCadastro ) {
        this.dataCadastro = dataCadastro;
    }

    public Produto( int id, String descricao, double preco, Date dataCadastro ) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.dataCadastro = dataCadastro;
    }
}
