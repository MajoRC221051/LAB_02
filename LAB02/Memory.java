// María José Ramírez - 221051 - POO

public class Memory{
    private String type;
    private double tamaño;
    private double bloques;
    

    public Memory(String type, double tamaño, double bloques) {
        this.type = type;
        this.tamaño = tamaño;
        this.bloques = bloques;
    }


    
    /** 
     * @return String
     */
    public String getType() {
        return this.type;
    }

    
    /** 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    
    /** 
     * @return double
     */
    public double getTamaño() {
        return this.tamaño;
    }

    
    /** 
     * @param tamaño
     */
    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
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
            " type='" + getType() + "'" +
            ", tamaño='" + getTamaño() + "'" +
            ", bloques='" + getBloques() + "'" +
            "}";
    }
    
}
