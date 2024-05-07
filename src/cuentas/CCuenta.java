package cuentas;

/**
 * Esta clase simula una cuenta bancaria.
 * @author Maria
 * @version 1.0
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor vacío para la clase CCuenta
     */
    public CCuenta()
    {
    }

    /**
     * Constructor de la clase CCuenta con todos los atributos
     * @param nom Nombre del titular de la cuenta
     * @param cue Número de la cuenta
     * @param sal Saldo de la cuenta
     * @param tipo Tipo de interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Este método devuelve el saldo de la cuenta
     * @return saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Este método permite ingresar una cantidad a la cuenta
     * @param cantidad La cantidad de dinero a ingresar
     * @throws Exception si la cantidad es negativa
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Este método permite retirar una cantidad de la cuenta
     *  @param cantidad La cantidad de dinero a retirar
     * @throws Exception si la cantidad es menor o igual a 0 o si no hay suficiente saldo
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInteres() {
		return tipoInteres;
	}

	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
