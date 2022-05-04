package main.question38;

public class EventoHeranca extends DataHora {

    private String evento;

    public EventoHeranca(String data, String horario, String evento) {
        super(data, horario);
        this.evento = evento;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "EventoHeranca{" + "evento=" + evento + ", data=" + data + ", horario=" + horario + "}";
    }
}
