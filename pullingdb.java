import java.sql.*; 
import oracle.jdbc.*; 
import oracle.jdbc.pool.OracleDataSource;

class pullingdb {
    public static void main (String[] args) throws SQLException{
        OracleDataSource ode = new OracleDataSource(); 
        ode.setURL("jdbc:oracle:thin:future_checkbook/future_checkbook@localhost:1521/XE"); 
        Connection con = ode.getConnection(); 

        DatabaseMetaData meta = conn.getMetaData(); 

        System.out.println("JDBC version is" + meta.getDriverVersion()); 
    }
}