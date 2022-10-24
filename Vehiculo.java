public class Vehiculo {

    public static Vehiculo[] vehiculos = new Vehiculo[10];

    public static int tamano = 10;
    public static int posAnadir = 0;

    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;

    public Vehiculo() {

    }

    public Vehiculo(int mo, String ma, double va) {
        this(mo, ma, va, "verde");
    }

    public Vehiculo(int mo, String ma, double va, String co) {
        this.modelo = mo;
        this.marca = ma;
        this.valorComercial = va;
        this.color = co;
        Vehiculo.vehiculos[Vehiculo.posAnadir] = this;
        posAnadir++;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public double getValorComecial() {
        return valorComercial;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }

    public String toString() {
        return " Modelo: " + modelo + "\n" + " Marca: " + marca + "\n" + " Valor: " + valorComercial + "\n" + " Color: "
                + color;
    }

    public static String toStringVehiculos() {
        String a = "";
        for (int i = 0; i < posAnadir; i++) {
            a = a + Vehiculo.vehiculos[i].toString() + "\n";
        }
        return a;
    }

    public static String cantidadVehiculos() {
        return "El total de vehículos es de: " + posAnadir;
    }

    public static String toStringVerdes() {
        String color = "";
        for (int i = 0; i < Vehiculo.posAnadir; i++) {
            if (Vehiculo.vehiculos[i].color.equals("verde")) {
                color += Vehiculo.vehiculos[i].toString() + "\n";
            }
        }
        return color;
    }

    public static String toStringModelos() {
        String modelo = "";
        for (int i = 0; i < Vehiculo.posAnadir; i++) {
            if (Vehiculo.vehiculos[i].modelo > (1999) && Vehiculo.vehiculos[i].modelo < (2022)) {
                modelo += Vehiculo.vehiculos[i].toString() + "\n";
            }
        }
        return modelo;
    }
}