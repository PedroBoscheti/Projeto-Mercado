package apex.DAO;

import apex.DTO.ClientesDTO;
import java.sql.ResultSet;

public class ClientesDAO {
     
    
    public static boolean Insere(ClientesDTO cli){
        ConexaoDAO conexao = new ConexaoDAO();
        String comando = "INSERT INTO CLIENTES(NOME_CLIENTE,IDADE,ATIVO) VALUES (";
        comando += "'"+ cli.getNome_cliente() + "',";
        comando += cli.getIdade()+ ",";
        comando += cli.getAtivo() + ")";
        return conexao.ExecutaComando(comando);
    }
    
    public static boolean apaga(ClientesDTO cli){
        ConexaoDAO conexao = new ConexaoDAO();
        return conexao.ExecutaComando("DELETE FROM CLIENTES WHERE ID_CLIENTE = "+cli.getId_cliente());
    }
    
    public static ResultSet retornaClientes(){
        ConexaoDAO conexao = new ConexaoDAO();
        return conexao.retornaDados("SELECT * FROM CLIENTES");
    }
    
    public static boolean atualizaCliente(ClientesDTO cli){
        ConexaoDAO conexao = new ConexaoDAO();
        String Comando = "UPDATE CLIENTES SET ";
        Comando += "NOME_CLIENTE = " + "'"+ cli.getNome_cliente() + "',";
        Comando += "IDADE = " + cli.getIdade() + ",";
        Comando += "ATIVO = " + cli.getAtivo();
        Comando += " where id_cliente = "+cli.getId_cliente();
        return conexao.ExecutaComando(Comando);
    }
    
}
