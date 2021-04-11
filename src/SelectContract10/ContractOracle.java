package SelectContract10;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cat Panetta
 */

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import oracle.jdbc.OracleTypes;
public class ContractOracle {
    

public static void saveContract( Contract c ) throws SQLException {
    DataSource ds = MyDataSourceFactory.getOracleDataSource();
    Connection con = null;
    CallableStatement cstmt = null;
    try {
        con = ds.getConnection();
        cstmt = con.prepareCall("BEGIN PanettaC_W21.PKGREC.CONTRACT_ADD(?,?,?,?,?); END;");
        cstmt.registerOutParameter(5, OracleTypes.NUMBER);
        cstmt.setString(1, c.getContractID());
        cstmt.setString(2, c.getOriginCity());
        cstmt.setString(3, c.getDestCity());
        cstmt.setString(4, c.getOrderItem());
        
        cstmt.executeUpdate();
        int retVal = cstmt.getInt(5);
        
    } catch (SQLException s) {
        System.out.println(s.getMessage());
        } finally {
            try {
                if (cstmt != null) {
                cstmt.close();
                }
                if (con != null) {
                con.close();
                }
                } catch (SQLException e) {
                    e.printStackTrace();
                   } // end SQLException catch
    } // end finally block
    }  // end saveContract method
    } // end clas
    

