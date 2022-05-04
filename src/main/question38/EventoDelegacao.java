package main.question38;

public class EventoDelegacao {

    private String evento;

    private DataHora dataHora;

    public EventoDelegacao(DataHora dataHora, String evento) {
        this.dataHora = dataHora;
        this.evento = evento;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public DataHora getDataHora() {
        return dataHora;
    }

    public void setDataHora(DataHora dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "EventoDelegacao{" +
                "evento='" + evento + '\'' +
                ", dataHora=" + dataHora +
                '}';
    }
}
