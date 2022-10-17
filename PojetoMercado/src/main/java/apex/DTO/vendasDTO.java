package apex.DTO;

public class VendasDTO {
  private int id_venda;   
  private int fk_produto; 
  private int fk_cliente; 
  private int quantidade; 

    public int getId_venda() {
        return id_venda;
    }

    public int getFk_produto() {
        return fk_produto;
    }

    public int getFk_cliente() {
        return fk_cliente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public void setFk_produto(int fk_produto) {
        this.fk_produto = fk_produto;
    }

    public void setFk_cliente(int fk_cliente) {
        this.fk_cliente = fk_cliente;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
