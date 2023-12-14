package hwibin.prac.jdbc_crud_prac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCTemplate {

    public void executeUpdate(User user, String sql, PreparedStatementSetter pss) throws SQLException {
        Connection con = null;
        PreparedStatement pstat = null;

        try {
            con = ConnectionManager.getConnection();
            pstat = con.prepareStatement(sql);
            pstat.setString(1, user.getUserId());
            pstat.setString(2, user.getPassword());
            pstat.setString(3, user.getUserId());
            pstat.setString(4, user.getEmail());

            pstat.executeUpdate();
        } finally {
            if (pstat != null) {
                pstat.close();
            }
        }

        if (con != null) {
            con.close();
        }
    }

}
