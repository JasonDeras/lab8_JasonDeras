package lab8;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminHackeo {

    private ArrayList<Hackeo> listaHackeo = new ArrayList();
    private File archivo = null;

    public adminHackeo(String path) {
        archivo = new File(path);
    }

    public ArrayList<Hackeo> getListaHackeo() {
        return listaHackeo;
    }

    public void setListaHackeo(ArrayList<Hackeo> listaHackeo) {
        this.listaHackeo = listaHackeo;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaHackeo=" + listaHackeo;
    }

    //extra mutador
    public void setHackeo(Hackeo h) {
        this.listaHackeo.add(h);
    }

    public void cargarArchivo() {
        try {
            listaHackeo = new ArrayList();
            Hackeo temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Hackeo) objeto.readObject()) != null) {
                        listaHackeo.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Hackeo t : listaHackeo) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
