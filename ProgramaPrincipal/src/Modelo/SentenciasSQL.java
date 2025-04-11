package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SentenciasSQL {

    public ResultSet ExtraccionInformacion(Connection conn,  PreparedStatement ps) throws SQLException {
        ResultSet rs = ps.executeQuery();
        conn.close();
        return rs;
    }

    public void modificacionInformacion(Connection conn, PreparedStatement ps) throws SQLException {
        ps.executeQuery();
        conn.close();
    }


}
