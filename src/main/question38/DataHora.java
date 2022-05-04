package main.question38;

public class DataHora {

    protected String data;

    protected String horario;

    public DataHora(String data, String horario) {
        this.data = data;
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "DataHora{" +
                "data='" + data + '\'' +
                ", horario='" + horario + '\'' +
                '}';
    }
}
