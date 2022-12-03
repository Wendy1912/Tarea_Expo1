

public class PruebaCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Jane Green", 50.00);
        Cuenta cuenta2 = new Cuenta("John Blue", -7.53);

        // muestra el saldo inicial de cada objeto
        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el monto a depositar para cuenta1: "); // indicador (promt)
        double montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
        System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n",
        montoDeposito);
        cuenta1.depositar(montoDeposito); // suma al saldo de cuenta1

        // muestra los saldos
        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);
        
        System.out.print("Escriba el monto a depositar para cuenta2: "); // indicador (promt)
        montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
        System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n",
                osito);
        cuenta2.depositar(montoDeposito); // suma al saldo de cuenta2

        // muestra los saldos
        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);
        
    } // fin de main
    public static void mostrarCuenta(Cuenta cuent
         AMostrar) {
        System.out.printf("Saldo de %s: $%.2f%n", cuentaAMostrar.obtenerNombre(), cuentaAMostrar.obtenerSaldo());
        cuentaAMostrar.obtenerSaldo();
        ;
        }

} // fin de la clase PruebaCuenta
