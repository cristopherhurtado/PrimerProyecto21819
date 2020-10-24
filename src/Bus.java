
import javax.swing.JOptionPane;


public class Bus extends Vehiculo{
    int numeroAsientos;

    public Bus(String patente, String modelo, int potencia, int numeroAsientos) {
        super(patente, modelo, potencia);
        this.numeroAsientos = numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }
    
    public void mostrarDatos(){
       //System.out.println("La patente del Bus es : "+getPatente()+"El modelo del Bus es : "+getModelo()+"La potencia del Bus es : "+getPotencia()+".rp"+"Numero de asientos del Bus es : "+numeroAsientos);
       JOptionPane.showMessageDialog(null,"Patente: " + patente + "\nModelo: " + 
               modelo + "\nPotencia: " + potencia + " HP" + 
               "\nNumero Asientos: "+numeroAsientos,"REGISTRO BUS",
               JOptionPane.INFORMATION_MESSAGE); 
        
    
}
}    
    
