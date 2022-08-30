package taller3.televisores;

public class TV {

    // Atributos
    public static int numTV=0;
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;

    // Constructor
    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        numTV++;
    }

    // Getter and Setters

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public static int getNumTV() {
        return numTV;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }



    public void turnOn(){
        this.estado = true;
    }
    public void turnOff(){
        this.estado = false;
    }

    public boolean getEstado() {
        return estado;
    }


    public void canalUp(){
        if (this.canal > 1 && this.canal < 120 && this.estado) {
            this.canal++;
        }
    }
    public void canalDown(){
        if (this.canal > 1 && this.canal < 120 && this.estado) {
            this.canal--;
        }
    }

    public void volumenUp(){
        if (this.volumen > 0 && this.volumen < 7 && this.estado) {
            this.volumen++;
        }
    }
    public void volumenDown(){
        if (this.volumen > 0 && this.volumen < 7 && this.estado) {
            this.volumen--;
        }
    }




}
