
import javax.swing.JOptionPane;


public class Taxi extends Vehiculo{
   int numeroLicencia;

    public Taxi(String patente, String modelo, int potencia, int numeroLicencia) {
        super(patente, modelo, potencia);
        this.numeroLicencia = numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public int getNumeroLicencia() {
        return numeroLicencia;
    }
   
   public void mostrarDatos(){
       //System.out.print("Numero de Patente del Taxi es : "+getPatente()+"El modelo del Taxi es : "+getModelo()+"La potencia del Taxi es : "+getPotencia()+".rp"+numeroLicencia);
       JOptionPane.showMessageDialog(null,"Patente: " + patente + "\nModelo: " + 
               modelo + "\nPotencia: " + potencia + " HP" + 
               "\nNumero Licencia: "+numeroLicencia,"REGISTRO TAXI",
               JOptionPane.INFORMATION_MESSAGE);
       
   }
   
    
}
