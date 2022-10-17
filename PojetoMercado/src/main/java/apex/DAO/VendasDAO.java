package apex.DAO;

import apex.DTO.VendasDTO;
import java.sql.ResultSet;

public class VendasDAO {
     
    
    public static boolean Insere(VendasDTO cli){
        ConexaoDAO conexao = new ConexaoDAO();
        String comando = "INSERT INTO VENDAS(FK_PRODUTO,FK_CLIENTE,QUANTIDADE) VALUES (";
        comando += "'"+ cli.getFk_produto() + "',";
        comando += cli.getFk_cliente()+ ",";
        comando += cli.getQuantidade()+ ")";
        return conexao.ExecutaComando(comando);
    }
    
    public static boolean apaga(VendasDTO cli){
        ConexaoDAO conexao = new ConexaoDAO();
        return conexao.ExecutaComando("DELETE FROM VENDAS WHERE ID_VENDA = "+cli.getId_venda());
    }
    
    public static ResultSet retornaVendas(){
        ConexaoDAO conexao = new ConexaoDAO();
        return conexao.retornaDados("SELECT * FROM VENDAS");
    }
    
    public static boolean atualizaVenda(VendasDTO cli){
        ConexaoDAO conexao = new ConexaoDAO();
        String Comando = "UPDATE VENDAS SET ";
        Comando += "FK_PRODUTO = " + "'"+ cli.getFk_produto() + "',";
        Comando += "FK_CLIENTE = " + cli.getFk_cliente() + ",";
        Comando += "QUANTIDADE = " + cli.getQuantidade();
        Comando += " WHERE ID_VENDA = "+cli.getId_venda();
        return conexao.ExecutaComando(Comando);
    }
    
}
