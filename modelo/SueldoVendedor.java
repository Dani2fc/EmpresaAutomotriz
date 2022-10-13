package modelo;

public class SueldoVendedor {

    // Atributos
    private String Nombre;
    private int SALARIOMINIMO;
    private int[] Ganancia;
    private double Sueldo;
    private int precioCarro;
    private int Autos;

    // Métodos

    /* Método Constructor */
    public SueldoVendedor(String pNombre, int pAutos) {
        this.Nombre = pNombre;
        this.SALARIOMINIMO = 1000000;
        this.Autos = pAutos;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setAutos(int Autos) {
        this.Autos = Autos;
    }

    public int getAutos() {
        return Autos;
    }

    public void setSALARIOMINIMO(int pSALARIOMINIMO) {
        this.SALARIOMINIMO = pSALARIOMINIMO;
    }

    public int getSALARIOMINIMO() {
        return SALARIOMINIMO;
    }

    public int getPrecioCarro() {
        return precioCarro;
    }

    public void setPrecioCarro(int precioCarro) {
        this.precioCarro = precioCarro;
    }
    
    public void hallarSueldo() {
        Ganancia = new int[Autos];
        for(int i = 0; i < Ganancia.length; i++){
            Sueldo = ((SALARIOMINIMO + (100000 * Autos)) + (precioCarro * 0.02));
        } 
    }
}