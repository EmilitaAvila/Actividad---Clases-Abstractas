package ec.edu.puce.clasesabstractas;


public class Circulo extends FiguraGeometrica2 {
	
    private double radio;

    public Circulo(String nombre) {
        super(nombre);
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}




