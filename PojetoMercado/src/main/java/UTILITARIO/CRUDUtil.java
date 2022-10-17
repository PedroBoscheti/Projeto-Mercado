package UTILITARIO;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class CRUDUtil {
    public static TableModel resultSetToTableModel(ResultSet rs) {
        try {
            ResultSetMetaData metaData = rs.getMetaData();
            int NumerodeColunas = metaData.getColumnCount();
            Vector NomeDasColunas = new Vector();

            // Get the column names
            for (int Coluna = 0; Coluna < NumerodeColunas; Coluna++) {
                NomeDasColunas.addElement(metaData.getColumnLabel(Coluna + 1));
            }

            // Get all rows.
            Vector Linhas = new Vector();

            while (rs.next()) {
                Vector NovaLinha = new Vector();

                for (int i = 1; i <= NumerodeColunas; i++) {
                    NovaLinha.addElement(rs.getObject(i));
                }

                Linhas.addElement(NovaLinha);
            }

            return new DefaultTableModel(Linhas, NomeDasColunas);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }  
}