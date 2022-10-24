public class Sensor {

  public static Sensor[] sensores = new Sensor[8];

  public static int tamano = 8;
  public static int posAnadir = 0;

  private String tipo;
  private double valor;

  public Sensor() {

  }

  public Sensor(String t, double v) {
    this.tipo = t;
    this.valor = v;
    Sensor.sensores[Sensor.posAnadir] = this;
    posAnadir++;
  }

  public String getTipo() {
    return tipo;
  }

  public double getValor() {
    return valor;
  }

  public void setTipo(String t) {
    this.tipo = t;
  }

  public void setValor(double v) {
    this.valor = v;
  }

  public String toString() {
    return "Sensor tipo: " + this.tipo + "\n" + "valor: " + this.valor;
  }

  public static String toStringSensores() {
    String a = "";
    for (int i = 0; i < posAnadir; i++) {
      a = a + Sensor.sensores[i].toString() + "\n";
    }
    return a;
  }

  public static String cantidadSensores() {
    return "El total de sensores es de: " + posAnadir;
  }

  public static String toStringTemperatura() {
    String tipo = "";
    for (int i = 0; i < Sensor.posAnadir; i++) {
      if (Sensor.sensores[i].tipo.equals("temperatura")) {
        tipo += Sensor.sensores[i].toString() + "\n";
      }
    }
    return tipo;
  }
}