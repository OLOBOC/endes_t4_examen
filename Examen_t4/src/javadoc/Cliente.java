package javadoc;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa al cliente de un banco
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String id;
    private List<CuentaBancaria> cuentas;

    /**
     * Constructor de la clase Cliente
     * @param nombre   Es el nombre del cliente
     * @param apellido Es el apellido del cliente
     * @param id       Es el identificador del cliente
     */
    public Cliente(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.cuentas = new ArrayList<>();
    }

    /**
     * Obtiene el nombre del cliente
     * @return el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente
     * @param nombre el nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del cliente
     * @return el apellido del cliente
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del cliente
     * @param apellido el apellido del cliente
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene el identificador del cliente
     * @return el identificador del cliente
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el identificador del cliente
     * @param id el identificador del cliente.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene una copia de la lista de cuentas del cliente
     * @return la copia de la lista de cuentas del cliente
     */
    public List<CuentaBancaria> getCuentas() {
        return new ArrayList<>(cuentas);
    }

    /**
     * Agrega una cuenta bancaria a la lista de cuentas del cliente
     * @param cuenta la cuenta bancaria que tiene que agregar
     */
    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    /**
     * Cierra la cuenta bancaria del cliente
     * @param numeroCuenta el número de cuenta de la cuenta a cerrar
     * @return true si la cuenta se cerró correctamente o false en caso contrario.
     */
    public boolean cerrarCuenta(String numeroCuenta) {
        return cuentas.removeIf(cuenta -> cuenta.getNumeroCuenta().equals(numeroCuenta));
    }

    /**
     * Devuelve una representación con forma de cadena de texto del cliente
     * @return una representación con forma de cadena de texto del cliente
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                ", cuentas=" + cuentas +
                '}';
    }
}
