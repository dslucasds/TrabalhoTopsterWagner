package br.SisAgenda.dao;

import br.SisAgenda.modelo.Equipe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Dao extends ConnectionFactory {

    private Connection con;

    public Dao() {
        this.con = this.getConnection();
    }

    public void inserir(Equipe eqp) throws SQLException {

        String sql = "insert into equipe "
                + "(idEquip, nomEquip, "
                + "desEquip) "
                + "values (?, ?, ?);";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, eqp.getIdEqp());
            st.setString(2, eqp.getNomEqp());
            st.setString(3, eqp.getDesEqp());

            st.execute();
            st.close();
        }

        this.con.close();

    }

    public void eliminar(int idEquip) throws SQLException {

        String sql = "delete from cliente where idEquip = ?";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, idEquip);
            st.execute();
            st.close();
        }

        this.con.close();

    }

    public void alterar(Equipe eqp) throws SQLException {

        String sql2 = "insert into equipe "
                + "(idEquip, nomEquip, "
                + "desEquip) "
                + "values (?, ?, ?);";

        String sql = "update equipe set idEquip = ?, nomEquip = ?, desEquip = ?";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, eqp.getIdEqp());
            st.setString(2, eqp.getNomEqp());
            st.setString(3, eqp.getDesEqp());

            st.execute();
            st.close();
        }

        this.con.close();

    }
    
     public List<Equipe> listarEquipe() throws SQLException {
        String sql = "select * from equipe";
        List<Equipe> equipe = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();

            equipe = new ArrayList<Equipe>();

            while (rs.next()) {
                Equipe e = new Equipe();
                e.setIdEqp(rs.getInt("idEqp"));
                e.setNomEqp(rs.getString("nomEqp"));
                e.setDesEqp(rs.getString("desEqp"));
                

                equipe.add(e);
            }

            rs.close();
            st.close();

        }

        this.con.close();
        return equipe;
    }

     public Equipe getEquipe(int idEqp) throws SQLException {
        String sql = "select * from  where idEqp = ?";
        Equipe equipe = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, idEqp);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    equipe = new Equipe();
                    equipe.setIdEqp(rs.getInt("idEqp"));
                    equipe.setNomEqp(rs.getString("nomEqp"));
                    equipe.setDesEqp(rs.getString("desEqp"));
                    
                    
                }
            }
            st.close();
        }

        this.con.close();
        return equipe;
    }

    
}
