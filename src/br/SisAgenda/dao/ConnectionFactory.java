package br.SisAgenda.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    //trocar a seenha toda vida pra eu poder acessar no trmapo
                    //setar o tempo certo: SET @@global.time_zone = '+3:00';
                    //tem q da um Update em uma idEqp e mudar a  id pra "0" ai eu consigo cadastrar os colaborador na eqp zero
                    
                    "jdbc:mysql://127.0.0.1/sistema_agenda", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
