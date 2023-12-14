package hwibin.prac.jdbc_crud_prac;

import java.sql.SQLException;

public interface PreparedStatementSetter {

    void setter(PreparedStatementSetter pstat) throws SQLException;

}
