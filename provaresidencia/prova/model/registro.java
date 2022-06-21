package prova.model;

public class registro {
    private rank.String nome;
    private String atendido;
    private String nao_atendido;
    private String total;
    private String Ranker;

    private static registro instanceRegistro = null;
    private String string;

    public static synchronized registro getinstancRegistro() {
        if (instanceRegistro == null)
        instanceRegistro = new registro();
        return instanceRegistro;
    }

    public registro () {

    }

    public registro(String String string = String;
    rank, String nome, String atendido, String nao_atendido, String total){
        java.lang.String rank;
        this.Ranker = rank;
        this.nome = nome;
        this.atendido = atendido;
        this.nao_atendido = nao_atendido;
        this.total = total;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getAtendido() { return atendido; }
    public void setAtendido(String atendido) { this.atendido = atendido; }

    public String getNaoAtendido() { return nao_atendido; }
    public void setNaoAtendido(String nao_atendido) { this.nao_atendido = nao_atendido; }

    public String getTotal() { return total; }
    public void setTotal(String total) { this.total = total; }

    public String getRanker() { return Ranker; }
    public void setRanker(String ranker) { this.Ranker = ranker; }
}
