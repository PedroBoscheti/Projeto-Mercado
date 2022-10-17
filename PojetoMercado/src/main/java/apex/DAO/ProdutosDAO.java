package apex.DAO;

import apex.DTO.ProdutosDTO;
import java.sql.ResultSet;

public class ProdutosDAO {
     
    
    public static boolean Insere(ProdutosDTO prod){
        ConexaoDAO conexao = new ConexaoDAO();
        String comando = "INSERT INTO PRODUTOS(DESCRICAO_PRODUTO,PRECO,ATIVO) VALUES (";
        comando += "'"+ prod.getDescricao_produto() + "',";
        comando += prod.getPreco()+ ",";
        comando += prod.getAtivo() + ")";
        return conexao.ExecutaComando(comando);
    }
    
    public static boolean apaga(ProdutosDTO prod){
        ConexaoDAO conexao = new ConexaoDAO();
        return conexao.ExecutaComando("DELETE FROM PRODUTOS WHERE ID_PRODUTO = "+prod.getId_produto());
    }
    
    public static ResultSet retornaProdutos(){
        ConexaoDAO conexao = new ConexaoDAO();
        return conexao.retornaDados("SELECT * FROM PRODUTOS");
    }
    
    public static boolean atualizaProduto(ProdutosDTO prod){
        ConexaoDAO conexao = new ConexaoDAO();
        String Comando = "UPDATE PRODUTOS SET ";
        Comando += "DESCRICAO_PRODUTO = " + "'"+ prod.getDescricao_produto() + "',";
        Comando += "PRECO = " + prod.getPreco()+ ",";
        Comando += "ATIVO = " + prod.getAtivo();
            Comando += " where id_produto = "+prod.getId_produto();
        return conexao.ExecutaComando(Comando);
    }
    
}
