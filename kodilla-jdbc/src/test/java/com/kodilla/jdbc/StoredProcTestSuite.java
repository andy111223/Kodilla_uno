package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoredProcTestSuite {

    @Test
    void testUpdateVipLevels() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL='Not set'";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        // When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);

        // Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL='Not set'";
        ResultSet rs = statement.executeQuery(sqlCheckTable);

        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);
        rs.close();
        statement.close();
    }
    @Test
    void testUpdateBestsellers() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();
        Statement statement = dbManager.getConnection().createStatement();

        // When
        boolean isExecuted = statement.execute("CALL UpdateBestsellers()");

        // Then
        String checkSQL = "SELECT COUNT(*) AS bestseller_count FROM BOOKS WHERE BESTSELLER = TRUE";
        ResultSet rs = statement.executeQuery(checkSQL);

        int bestsellerCount = 0;
        if (rs.next()) {
            bestsellerCount = rs.getInt("bestseller_count");
        }
        System.out.println(bestsellerCount);
    }

}
