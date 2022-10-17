package apex.DTO;

public class ProdutosDTO {
   private int id_produto;
   private String descricao_produto;
   private double preco;
   private int ativo;

    public int getId_produto() {
        return id_produto;
    }

    public String getDescricao_produto() {
        return descricao_produto;
    }

    public double getPreco() {
        return preco;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public void setDescricao_produto(String descricao_produto) {
        this.descricao_produto = descricao_produto;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }
   
   
}
