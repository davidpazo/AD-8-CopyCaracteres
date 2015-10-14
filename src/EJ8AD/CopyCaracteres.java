package EJ8AD;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CopyCaracteres {

    private final String ruta = "/home/oracle/Desktop/Pruebas/texto8.txt";
    private final File file = new File(ruta);
    FileWriter fw;
    FileReader fr;
    String rutaFichOrigen = "/home/oracle/Desktop/Pruebas/texto8.txt";//Ruta al fichero de origen
    String rutaFichDestino = "/home/oracle/Desktop/Pruebas/texto9"; //Ruta al fichero de destino
    File ficheroOrigen = new File("/home/oracle/Desktop/Pruebas/texto8.txt");//Creamos objeto de tipo fichero con la ruta origen.
    File ficheroDestino = new File("/home/oracle/Desktop/Pruebas/texto9.txt");//Creamos objeto de tipo fichero con la ruta destino.

    public void Escribir(){
          
        try {
            fr = new FileReader(rutaFichOrigen);
            fw = new FileWriter(ficheroDestino); 
            int carac;//variable que ira conteniendo la linea que leemos para despues escribirla
            while ((carac = fr.read()) != -1) { //mientras haya caracteres...
                fw.write(carac);//Escribe el caracter al fichero destino
            }

        } catch (FileNotFoundException e) {

        } catch (IOException e) {
        } finally {
            try {
                fr.close();//cerramos el lector
                fw.close();//cerramos el escritor
            } catch (IOException ex) {
                Logger.getLogger(CopyCaracteres.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }

    }

    public static void main(String[] arg) {
        CopyCaracteres ob = new CopyCaracteres();
        ob.Escribir();
    }
}