package br.SisAgenda.dao;

import br.SisAgenda.modelo.Colaborador;
import br.SisAgenda.modelo.Equipe;
import br.SisAgenda.modelo.Tarefa;
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

   ////////////////////DAO EQUIPE INÍCIO////////////////////////////////////
    
//INSERIR EQUIPE//
    public void inserir(Equipe eqp) throws SQLException {

        String sql = "insert into equipe "
                + "(idEqp, nomEqp, "
                + "desEqp) "
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

    //ELIMINAR EQUIPE//
    public void eliminar(int idEqp) throws SQLException {

        String sql = "delete from equipe where idEqp = ?";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, idEqp);
            st.execute();
            st.close();
        }

        this.con.close();

    }

    //ALTERAR EQUIPE//
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

    //LISTAR EQUIPE//
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
        String sql = "select * from equipe where idEqp = ?";
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

    ////////////////////////DAO EQUIPE FINAL//////////////////////////////////
    
    
    
    ///////////////////////DAO TAREFA INÍCIO//////////////////////////////////
    
    //LISTAR TAREFA//
    public List<Tarefa> listarTarefa() throws SQLException {
        String sql = "select * from agenda";
        List<Tarefa> tarefa = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();

            tarefa = new ArrayList<Tarefa>();

            while (rs.next()) {
                Tarefa t = new Tarefa();
                t.setDataCri(rs.getString("dataCri"));
                t.setDataEnt(rs.getString("dataEnt"));
                t.setTitAge(rs.getString("titAge"));
                t.setDesAge(rs.getString("desAge"));
                t.setIdEqp(rs.getInt("idEqp"));
                t.setIdCol(rs.getInt("idCol"));

                tarefa.add(t);
            }

            rs.close();
            st.close();

        }

        this.con.close();
        return tarefa;
    }

    public Tarefa getTarefa(int idEqp) throws SQLException {
        String sql = "select * from  where idEqp = ?";
        Tarefa tarefa = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, idEqp);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    tarefa = new Tarefa();
                    tarefa.setDataCri(rs.getString("dataCri"));
                    tarefa.setDataEnt(rs.getString("dataEnt"));
                    tarefa.setTitAge(rs.getString("titAge"));
                    tarefa.setDesAge(rs.getString("desAge"));
                    tarefa.setIdEqp(rs.getInt("idEqp"));
                    tarefa.setIdCol(rs.getInt("idCol"));
                }
            }
            st.close();
        }

        this.con.close();
        return tarefa;
    }

    //INSERIR TAREFA//
    public void inserir(Tarefa trf) throws SQLException {

        String sql = "insert into agenda "
                + "(dataCri, dataEnt, titAge, desAge, "
                + "idEqp, idCol) "
                + "values (?, ?, ?, ?, ?, ?);";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, trf.getDataCri());
            st.setString(2, trf.getDataEnt());
            st.setString(3, trf.getTitAge());
            st.setString(4, trf.getDesAge());
            st.setInt(5, trf.getIdEqp());
            st.setInt(6, trf.getIdCol());
            st.execute();
            st.close();
        }

        this.con.close();

    }

    //ALTERAR TAREFA//
    public void alterar(Tarefa trf) throws SQLException {

        String sql2 = "insert into agenda "
                + "(dataCri, dataEnt, titAge, desAge, "
                + "idEqp, idCol) "
                + "values (?, ?, ?, ?, ?, ?);";

        String sql = "update agenda set dataCri = ?, dataEnt = ?, titAge = ?"
                + "desAge = ?, idEqp = ?, idCol = ? ";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {

            st.setString(1, trf.getDataCri());
            st.setString(2, trf.getDataEnt());
            st.setString(3, trf.getTitAge());
            st.setString(4, trf.getDesAge());
            st.setInt(5, trf.getIdEqp());
            st.setInt(6, trf.getIdCol());
            st.execute();
            st.close();

        }

        this.con.close();

    }
    
    ////////////////////////DAO TAREFA FINAL///////////////////////////////////
    
    ///////////////////////DAO COLABORADOR INÍCIO/////////////////////////////
    
    //LISTAR COLABORADOR//
    public List<Colaborador> listarColaborador() throws SQLException {
        String sql = "select * from colaborador";
        List<Colaborador> colaborador = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();

            colaborador = new ArrayList<Colaborador>();

            while (rs.next()) {
                Colaborador c = new Colaborador();
                                
                c.setIdDoColab(rs.getInt("idCol"));
                c.setTipoUsuario(rs.getString("tipoCol"));
                c.setNomeColaborador(rs.getString("nomCol"));
                c.setLoginColaborador(rs.getString("loginCol"));
                c.setSenhaColaborador(rs.getString("senhaCol"));     
                c.setEnderecoColaborador(rs.getString("endCol"));
                c.setBairroColaborador(rs.getString("baiCol"));
                c.setEmailColaborador(rs.getString("emailCol"));
                c.setCodEquipe(rs.getInt("idEqp"));
                
                colaborador.add(c);
            }

            rs.close();
            st.close();

        }

        this.con.close();
        return colaborador;
    }

    public Colaborador getColaborador(int idCol) throws SQLException {
        String sql = "select * from  where idCol = ?";
        Colaborador colaborador = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, idCol);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    colaborador = new Colaborador();
                    
                    colaborador.setIdDoColab(rs.getInt("idCol"));
                    colaborador.setTipoUsuario(rs.getString("tipoCol"));
                    colaborador.setNomeColaborador(rs.getString("nomCol"));
                    colaborador.setLoginColaborador(rs.getString("loginCol"));
                    colaborador.setSenhaColaborador(rs.getString("senhaCol"));     
                    colaborador.setEnderecoColaborador(rs.getString("endCol"));
                    colaborador.setBairroColaborador(rs.getString("baiCol"));
                    colaborador.setEmailColaborador(rs.getString("emailCol"));
                    colaborador.setCodEquipe(rs.getInt("idEqp"));
                    
                }
            }
            st.close();
        }

        this.con.close();
        return colaborador;
    }

    //INSERIR COLABORADOR//
    public void inserir(Colaborador col) throws SQLException {

        String sql = "insert into colaborador "
                + "(idCol, tipoCol, nomCol, loginCol, "
                + "senhaCol, endCol, baiCol, emailCol, idEqp)"
                + "values (?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
                        
            st.setInt(1, col.getIdDoColab());
            st.setString(2, col.getTipoUsuario());
            st.setString(3, col.getNomeColaborador());
            st.setString(4, col.getLoginColaborador());
            st.setString(5, col.getSenhaColaborador());
            st.setString(6,col.getEnderecoColaborador());
            st.setString(7,col.getBairroColaborador());
            st.setString(8, col.getEmailColaborador());
            st.setInt(9,col.getIdDoColab());
                            
            st.execute();
            st.close();
            
            
        }

        this.con.close();

    }

    //ALTERAR TAREFA//
    public void alterar(Colaborador col) throws SQLException {

        String sql2 = "insert into colaborador "
                + "(idCol, tipoCol, nomCol, loginCol, "
                + "senhaCol, endCol, baiCol, emailCol, idEqp)"
                + "values (?, ?, ?, ?, ?, ?, ?, ?, ?);";

        String sql = "update equipe set idCol = ?, tipoCol = ?, nomCol = ?"
                + "loginCol = ?, senhaCol = ?, endCol = ?, baiCol = ?"
                + ", emailCol = ?, idEqp = ? ";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {

            st.setInt(1, col.getIdDoColab());
            st.setString(2, col.getTipoUsuario());
            st.setString(3, col.getNomeColaborador());
            st.setString(4, col.getLoginColaborador());
            st.setString(5, col.getSenhaColaborador());
            st.setString(6,col.getEnderecoColaborador());
            st.setString(7,col.getBairroColaborador());
            st.setString(8, col.getEmailColaborador());
            st.setInt(9,col.getIdDoColab());
            st.execute();
            st.close();

        }

        this.con.close();

    }
    
    /////////////////////////DAO COLABORADOR FINAL/////////////////////////////
    

}
