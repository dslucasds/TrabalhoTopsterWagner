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
            st.setInt(1, eqp.getIdEquip());
            st.setString(2, eqp.getNomEquip());
            st.setString(3, eqp.getDesEquip());

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
            st.setInt(1, eqp.getIdEquip());
            st.setString(2, eqp.getNomEquip());
            st.setString(3, eqp.getDesEquip());

            st.execute();
            st.close();
        }

        this.con.close();

    }
    
     public List<Equipe> listarClientes() throws SQLException {
        String sql = "select * from cliente";
        List<Equipe> equipe = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();

            equipe = new ArrayList<Equipe>();

            while (rs.next()) {
                Equipe e = new Equipe();
                e.setIdEquip(rs.getInt("idEquip"));
                e.setNomEquip(rs.getString("nomEquip"));
                e.setDesEquip(rs.getString("desEquip"));
                

                equipe.add(e);
            }

            rs.close();
            st.close();

        }

        this.con.close();
        return equipe;
    }

     /*public Equipe getEquipe(int idEquip) throws SQLException {
        String sql = "select * from  where codcli = ?";
        Equipe equipe = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, codcli);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    cliente = new Cliente();
                    cliente.setCodcli(rs.getInt("codcli"));
                    cliente.setNomcli(rs.getString("nomcli"));
                    cliente.setEndcli(rs.getString("endcli"));
                    cliente.setBaicli(rs.getString("baicli"));
                    cliente.setComcli(rs.getString("comcli"));
                    cliente.setCepcli(rs.getLong("cepcli"));
                    cliente.setCelcli(rs.getLong("celcli"));
                }
            }
            st.close();
        }

        this.con.close();
        return cliente;
    }

     */
}
