public class Partida {
    private String data;
    private String hora;
    private int placarTime1;
    private int placarTime2;
    private Time time1;
    private Time time2;
    private Estadio estadio;

    public Partida(String data, String hora, int placarTime1, int placarTime2, Time time1, Time time2, Estadio estadio) {
        this.data = data;
        this.hora = hora;
        this.placarTime1 = placarTime1;
        this.placarTime2 = placarTime2;
        this.time1 = time1;
        this.time2 = time2;
        this.estadio = estadio;
    }

    public void atualizarResultado(int placar1,int placar2)
    {
        this.placarTime1 = placar1;
        this.placarTime2 = placar2;
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getPlacarTime1() {
        return placarTime1;
    }

    public void setPlacarTime1(int placarTime1) {
        this.placarTime1 = placarTime1;
    }

    public int getPlacarTime2() {
        return placarTime2;
    }

    public void setPlacarTime2(int placarTime2) {
        this.placarTime2 = placarTime2;
    }

    public Time getTime1() {
        return time1;
    }

    public void setTime1(Time time1) {
        this.time1 = time1;
    }

    public Time getTime2() {
        return time2;
    }

    public void setTime2(Time time2) {
        this.time2 = time2;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
    public void mostrarDados()
    {
        System.out.println("\n" + this.time1.getPais() + " " +this.placarTime1 + " X " + this.placarTime2 + " " +this.time2.getPais() + "\nEstádio:" + this.estadio.getNome() + "\nData:" + this.data + "\nHora:" + this.hora);
    }

}

