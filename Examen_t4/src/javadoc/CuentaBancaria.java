package javadoc;

/**
 * Representa una cuenta bancaria del cliente.
 */
public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private Cliente propietario;

    /**
     * Constructor de la clase CuentaBancaria
     * @param numeroCuenta Es el número de cuenta de la cuenta bancaria
     * @param saldo        Es el saldo inicial de la cuenta bancaria
     * @param propietario  Es el propietario de la cuenta bancaria
     */
    public CuentaBancaria(String numeroCuenta, double saldo, Cliente propietario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }

    /**
     * Obtiene el número de cuenta de la cuenta bancaria
     * @return El número de cuenta de la cuenta bancaria
     */
    public String getNumeroCuenta() {

        return numeroCuenta;
    }

    /**
     * Establece el número de cuenta de la cuenta bancaria
     * @param numeroCuenta el número de cuenta de la cuenta bancaria
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * Obtiene el saldo de la cuenta bancaria
     * @return el saldo de la cuenta bancaria
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta bancaria
     * @param saldo el saldo de la cuenta bancaria
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el propietario de la cuenta bancaria
     * @return el propietario de la cuenta bancaria
     */
    public Cliente getPropietario() {
        return propietario;
    }

    /**
     * Establece el propietario de la cuenta bancaria
     * @param propietario el propietario de la cuenta bancaria
     */
    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    /**
     * Deposita una cantidad en la cuenta bancaria
     * @param cantidad la cantidad a depositar en cuenta bancaria
     */
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    /**
     * Retira alguna cantidad de la cuenta bancaria
     * @param cantidad la cantidad a retirar de la cuenta bancaria
     * @return true si se retira correctamente pero false si no hay suficiente saldo.
     */
    public boolean retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    /**
     * Devuelve una representación en forma de cadena de texto de la cuenta bancaria
     * @return una representación en forma de cadena de texto de la cuenta bancaria
     */
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", propietario=" + propietario.getNombre() + " " + propietario.getApellido() +
                '}';
    }
}
