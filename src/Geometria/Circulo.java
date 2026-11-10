package Geometria;

public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(String color,double radio){
        super(color);
        this.radio=radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if(radio<0) System.out.println("Radio incorrecto");
        else this.radio = radio;
    }

    @Override
    public double calcularArea(){
        return Math.PI*radio*radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*radio;
    }

    @Override
    public void imprimirDatos(){
        System.out.println("--- Circulo ---");
        System.out.println("Radio: "+getRadio());
        super.imprimirDatos();
    }
}
