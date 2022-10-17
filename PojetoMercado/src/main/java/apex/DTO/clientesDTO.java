package apex.DTO;

public class ClientesDTO {
   private int id_cliente;
   private String nome_cliente;
   private int idade;
   private int ativo;

    public int getId_cliente() {
        return id_cliente;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public int getIdade() {
        return idade;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }
   
}
