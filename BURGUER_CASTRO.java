public class Usuario{
	
	private String id_usuario;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String direccion;
	
	
	public Usuario(){
		
	}
	
	//Getters y Setters

}

//-------------------------------------------------

public class Administrador{
	
	public Administrador(){
	}
	
	//Getters y Setters
	
}


//-------------------------------------------------

public class Empleado{
	
	private String puesto;
	private double sueldo;
	private String horario;
	
	public Empleado(){
	}
		
	//Getters y Setters	
	
}


//--------------------------------------------------

public class Cliente(){
	
	private int puntos;
	
	public Cliente(){
		
		List<Compra> lista = new List<Compra>();
	}
	
	
	//Getters y Setters	

	
}

//---------------------------------------------------

public class Reserva{
	
	private int n_personas;
	private Date fecha;
	private Time hora;
	private Mesa mesa;
	private Cliente cliente;
	
	public Reserva(){
	}
	
	//Getters y Setters
	
	
}

//----------------------------------------------------

public class Mesa{
	
	private int numero;
	private int capacidad;
	private boolean reservada;
	
	public Mesa(){
	}
	
	//Getters y Setters
	
}

//----------------------------------------------------

public class Compra{
	
	private int unidades;
	private String modo_pago;
	private double precio_total;
	private Cliente cliente;
	List<Producto> productos;
	
	
	public Compra(){
		
	}
	
	//Getters y Setters
		
}

//----------------------------------------------------

public class Producto{
	
	private int n_producto;
	private String nombre;
	private double precio;
	
	
	public Producto(){
		
	}
	
	//Getters y Setters

}
