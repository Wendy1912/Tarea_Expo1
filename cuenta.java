
public class cuenta {

    private String nombre; // variable de instancia
    private double saldo; // variable de instancia

    // Constructor de Cuenta que recibe dos parámetros
    public Cuenta(String nombre, double saldo) {
        this.nombre = nombre; // asigna nombre a la variable de instancia nombre

        if (saldo > 0.0) // si el saldo es válido
        {
            this.saldo = saldo; // lo asigna a la variable de instancia saldo

            }}

    public void depositar(double montoDeposito) {
        if (montoDeposito > 0.0) // si el montoDeposito es válido
        {
            saldo = saldo + montoDeposito; // lo suma al saldo

            }}

    public double obtenerSaldo() {
        return saldo;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return nombre;
    }
} // fin de la clase Cuenta
