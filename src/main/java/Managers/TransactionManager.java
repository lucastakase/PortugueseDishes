package Managers;

import java.sql.SQLException;

public class TransactionManager {


    private ConnectionManager connectionManager;

    public void setConnectionManager(ConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }
    public void beginRead() {
        connectionManager.startConnection();
    }

    public void beginWrite() {
        try {
            connectionManager.getCurrentConnection().setAutoCommit(false);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void commit() {
        try {
            if (!connectionManager.getCurrentConnection().getAutoCommit()) {
                connectionManager.getCurrentConnection().commit();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        connectionManager.stopConnection();
    }

    public void rollback() {
        try {
            if (!connectionManager.getCurrentConnection().getAutoCommit()) {
                connectionManager.getCurrentConnection().rollback();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        connectionManager.stopConnection();
    }
}