// María José Ramírez - 221051 - POO

public class Navegadores {
    private String nombre;
    private double spaces;
    private  double bloques;



    public Navegadores(String nombre, double spaces, double bloques) {
        this.nombre = nombre;
        this.spaces = spaces;
        this.bloques = bloques;
    }


    
    /** 
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /** 
     * @return double
     */
    public double getSpaces() {
        return this.spaces;
    }

    
    /** 
     * @param spaces
     */
    public void setSpaces(double spaces) {
        this.spaces = spaces;
    }

    
    /** 
     * @return double
     */
    public double getBloques() {
        return this.bloques;
    }

    
    /** 
     * @param bloques
     */
    public void setBloques(double bloques) {
        this.bloques = bloques;
    }


    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", spaces='" + getSpaces() + "'" +
            ", bloques='" + getBloques() + "'" +
            "}";
    }



    
}
