package Clases;


 public class Movil 
 {

    public Movil() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getAnhoCreacion() {
        return AnhoCreacion;
    }

    public void setAnhoCreacion(int AnhoCreacion) {
        this.AnhoCreacion = AnhoCreacion;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public Movil getNodo_izquierdo() {
        return nodo_izquierdo;
    }

    

    public Movil getNodo_derecho() {
        return nodo_derecho;
    }
    
    private int Id;
    private String Marca;
    private int AnhoCreacion;
    private String SO;
    
    private Movil nodo_izquierdo;
    private Movil nodo_derecho;

    public Movil(int Id, String Marca, int AnhoCreacion, String SO) {
        this.Id = Id;
        this.Marca = Marca;
        this.AnhoCreacion = AnhoCreacion;
        this.SO = SO;
        
        this.nodo_derecho = null;
        this.nodo_izquierdo = null;
    }
    
    public void insertar_datos(int _id, String _Marca, int _AnhoCreacion, String _SO) {
    Movil Nuevo_movil = new Movil(_id, _Marca, _AnhoCreacion, _SO);

    if (_id < this.Id) {
        if (this.nodo_izquierdo == null) {
            this.nodo_izquierdo = Nuevo_movil;
        } else {
            this.nodo_izquierdo.insertar_datos(_id, _Marca, _AnhoCreacion, _SO);
        }
    } else {
        if (this.nodo_derecho == null) {
            this.nodo_derecho = Nuevo_movil;
        } else {
            this.nodo_derecho.insertar_datos(_id, _Marca, _AnhoCreacion, _SO);
        }
    }
}
    
    
//------------------------------------------------------------------------------------    
     // Método para buscar los datos relacionados a un Id
    public String Buscar_Id(int id) {
        Movil nodo = Buscar_nodo_por_Id(this, id);
        if (nodo != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(nodo.getId()).append("/");
            sb.append(nodo.getMarca()).append("/");
            sb.append(nodo.getAnhoCreacion()).append("/");
            sb.append(nodo.getSO());
            
            return sb.toString();
        } else {
            return "No se encontraron datos para el Id especificado.";
        }
    }

    private Movil Buscar_nodo_por_Id(Movil nodo, int id) {
        if (nodo == null || nodo.getId() == id) {
            return nodo;
        }
        if (id < nodo.getId()) {
            return Buscar_nodo_por_Id(nodo.getNodo_izquierdo(), id);
        } else {
            return Buscar_nodo_por_Id(nodo.getNodo_derecho(), id);
        }
    }
    
    // Fin de la busqueda de identificadores.
//-------------------------------------------------------------------------------------    
    // Método para eliminar un nodo según su Id
   public String Eliminar_nodo(int id) {
    boolean[] eliminado = new boolean[1];
    Movil nuevoArbol = Eliminar_nodo_recursivo(this, id, eliminado);
    if (eliminado[0]) {
        return "El nodo con ID " + id + " ha sido eliminado correctamente.";
    } else {
        return "No se puede eliminar el nodo porque tiene 2 hijos.";
    }
}

    private Movil Eliminar_nodo_recursivo(Movil nodo, int id, boolean[] eliminado) {
        if (nodo == null) {
            return null;
        }

        // Si el Id del nodo es menor que el Id a eliminar, buscar en el subárbol derecho
        if (id > nodo.getId()) {
            nodo.nodo_derecho = Eliminar_nodo_recursivo(nodo.nodo_derecho, id, eliminado);
        }
        // Si el Id del nodo es mayor que el Id a eliminar, buscar en el subárbol izquierdo
        else if (id < nodo.getId()) {
            nodo.nodo_izquierdo = Eliminar_nodo_recursivo(nodo.nodo_izquierdo, id, eliminado);
        }
        // Si el Id del nodo es igual al Id a eliminar, este es el nodo que se eliminará
        else {
            // Caso 1: El nodo a eliminar es una hoja (no tiene hijos)
            if (nodo.nodo_izquierdo == null && nodo.nodo_derecho == null) {
                eliminado[0] = true;
                return null; // Simplemente lo eliminamos, no necesitamos hacer más
            }
            // Caso 2: El nodo a eliminar tiene un solo hijo
            else if (nodo.nodo_izquierdo == null) {
                eliminado[0] = true;
                return nodo.nodo_derecho; // El hijo derecho toma su lugar
            } else if (nodo.nodo_derecho == null) {
                eliminado[0] = true;
                return nodo.nodo_izquierdo; // El hijo izquierdo toma su lugar
            }
            // Caso 3: El nodo a eliminar tiene dos hijos
            else {
                // Aquí no podemos eliminar el nodo directamente, debemos manejar este caso de manera especial
                // Podemos lanzar una excepción, imprimir un mensaje, o hacer cualquier otra acción requerida.
                eliminado[0] = false;
                System.out.println("No se puede eliminar el nodo porque tiene 2 hijos.");
                return nodo;
            }
        }
        return nodo;
    }


    private Movil Encontrar_sucesor(Movil nodo) {
        while (nodo.nodo_izquierdo != null) {
            nodo = nodo.nodo_izquierdo;
        }
        return nodo;
    }
    
    // Fin de las funciones para eliminar datos.
// -----------------------------------------------------------------------------------
// Retorno de Pre-orden, Post-Orden y In-orden    
    
   
    public String Pre_Orden() {
        StringBuilder sb = new StringBuilder();
        Pre_orden_recursivo(this, sb);
        return sb.toString().trim();
    }

    private void Pre_orden_recursivo(Movil nodo, StringBuilder sb) {
        if (nodo != null) {
            sb.append(nodo.getId()).append(" - ");
            Pre_orden_recursivo(nodo.getNodo_izquierdo(), sb);
            Pre_orden_recursivo(nodo.getNodo_derecho(), sb);
        }
    }

    // Método para recorrer el árbol en inorden y construir una cadena de texto
    public String In_orden() {
        StringBuilder sb = new StringBuilder();
        In_orden_recursivo(this, sb);
        return sb.toString().trim();
    }

    private void In_orden_recursivo(Movil nodo, StringBuilder sb) {
        if (nodo != null) {
            In_orden_recursivo(nodo.getNodo_izquierdo(), sb);
            sb.append(nodo.getId()).append(" - ");
            In_orden_recursivo(nodo.getNodo_derecho(), sb);
        }
    }

    // Método para recorrer el árbol en postorden y construir una cadena de texto
    public String Post_orden() {
        StringBuilder sb = new StringBuilder();
        Post_orden_recursivo(this, sb);
        return sb.toString().trim();
    }

    private void Post_orden_recursivo(Movil nodo, StringBuilder sb) {
        if (nodo != null) {
            Post_orden_recursivo(nodo.getNodo_izquierdo(), sb);
            Post_orden_recursivo(nodo.getNodo_derecho(), sb);
            sb.append(nodo.getId()).append(" - ");
        }
    }
    
    // Fin de la impresión Pre-orden, Post-Orden y In-orden.

//----------------------------------------------------------------------------------    
// Método para obtener la altura del árbol
    public int Obtener_altura() {
        return Obtener_altura_recursivo(this);
    }

    private int Obtener_altura_recursivo(Movil nodo) {
        if (nodo == null) {
            return 0;
        } else {
            // Obtener la altura de los subárboles izquierdo y derecho
            int alturaIzquierdo = Obtener_altura_recursivo(nodo.getNodo_izquierdo());
            int alturaDerecho = Obtener_altura_recursivo(nodo.getNodo_derecho());

            // La altura del árbol es la altura máxima de los subárboles más 1 (la raíz)
            return Math.max(alturaIzquierdo, alturaDerecho) + 1;
        }
    }
    
// Fin de las clases de "Altura del árbol"
//----------------------------------------------------------------------------------------    
    
    // Funciones para encontrar nodos hojas.
    public String Encontrar_nodos_hoja_en_String() 
    {
        StringBuilder hojasStringBuilder = new StringBuilder();
        Encontrar_nodos_hoja_en_String_recursivo(this, hojasStringBuilder);
        return hojasStringBuilder.toString().trim();
    }

    private void Encontrar_nodos_hoja_en_String_recursivo(Movil nodo, StringBuilder hojasStringBuilder) {
        if (nodo != null) {
            if (nodo.getNodo_izquierdo() == null && nodo.getNodo_derecho() == null) {
                hojasStringBuilder.append(nodo.getId()).append(" - ");
            }
            Encontrar_nodos_hoja_en_String_recursivo(nodo.getNodo_izquierdo(), hojasStringBuilder);
            Encontrar_nodos_hoja_en_String_recursivo(nodo.getNodo_derecho(), hojasStringBuilder);
        }
    }
    
   // Fin de las clases para mostrar hojas. 
//-------------------------------------------------------------------------------------------    
    
    
    
}// Fin de la clase.
