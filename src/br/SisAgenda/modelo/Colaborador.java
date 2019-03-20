package br.SisAgenda.modelo;

public class Colaborador {
    private int CodColab;
    private String CodEquipe;
    private String TipoUsuario;
    private String NomeColaborador;
    private String EnderecoColaborador;
    private String BairroColaborador;
    private String EmailColaborador;
    private String LoginColaborador;
    private String SenhaColaborador;

    public int getCodColab() {
        return CodColab;
    }

    public void setCodColab(int CodColab) {
        this.CodColab = CodColab;
    }

    public String getCodEquipe() {
        return CodEquipe;
    }

    public void setCodEquipe(String CodEquipe) {
        this.CodEquipe = CodEquipe;
    }
    

    public int getIdDoColab() {
        return CodColab;
    }

    public void setIdDoColab(int IdDoColab) {
        this.CodColab = IdDoColab;
    }

    public String getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(String TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }

    public String getNomeColaborador() {
        return NomeColaborador;
    }

    public void setNomeColaborador(String NomeColaborador) {
        this.NomeColaborador = NomeColaborador;
    }

    public String getEnderecoColaborador() {
        return EnderecoColaborador;
    }

    public void setEnderecoColaborador(String EnderecoColaborador) {
        this.EnderecoColaborador = EnderecoColaborador;
    }

    public String getBairroColaborador() {
        return BairroColaborador;
    }

    public void setBairroColaborador(String BairroColaborador) {
        this.BairroColaborador = BairroColaborador;
    }

    public String getEmailColaborador() {
        return EmailColaborador;
    }

    public void setEmailColaborador(String EmailColaborador) {
        this.EmailColaborador = EmailColaborador;
    }

    public String getLoginColaborador() {
        return LoginColaborador;
    }

    public void setLoginColaborador(String LoginColaborador) {
        this.LoginColaborador = LoginColaborador;
    }

    public String getSenhaColaborador() {
        return SenhaColaborador;
    }

    public void setSenhaColaborador(String SenhaColaborador) {
        this.SenhaColaborador = SenhaColaborador;
    }   
}
