package Geometria;

public class Cuadrado extends FiguraGeometrica {
    private double lado;

    public Cuadrado(String color,double lado){
        super(color);
        this.lado=lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado*lado;
    }

    @Override
    public double calcularPerimetro(){
        return lado*4;
    }

    @Override
    public void imprimirDatos(){
        System.out.println("--- Cuadrado ---");
        System.out.println("Lado: "+getLado());
        super.imprimirDatos();
    }
}
