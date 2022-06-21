import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;

import prova.model.registro;

public class animalcomplaint {
    private static animalcomplaint instanceanimalcomplaint;
    private Context context;
    private static String[] ranking = new String[0];
    private static String[] razao = new String[0];
    private static String[] nome = new String[0];
    private static String[] atendida = new String[0];
    private static String[] naoatendida = new String[0];
    private static String[] total = new String[0];


    public animalcomplaint(Context context2) {
    }

    public static synchronized animalcomplaint getInstanceanimalcomplaint(Context context) {
        if(instanceanimalcomplaint == null)
        instanceanimalcomplaint = new animalcomplaint(context);

        return instanceanimalcomplaint;
    }
    
    public List<registro> getanimalcomplaint() {
        List<registro> registroslist = new Arraylist<registro>() {
            int indice = 0;

            while (indice < this.razao.length) {
                registro registro = new registro();
                registro.setNome(this.ranking[indice]);
                registro.setAtendido(this.atendido[indice]);
                registro.setNaoAtendido(this.naoatendido[indice]);
                registro.setTotal(this.total[indice]);
                indice++;
            }
            return registroList;
        }
    

        public List<registro> searchregistro(String nome) {
            List<registro> registrosList = new Arraylist<Registros>();
            int indice = getIndexArraySearch(nome);
        }

        if (indice >= 0 ) {
            registro registro = new registro();
            registro.setNome(this.ranking[indice]);
            registro.setAtendido(this.atendido[indice]);
            registro.setNaoAtendido(this.naoatendido[indice]);
            registro.setTotal(this.total[indice]);

            registrosList.add(registro);
            return registrosList;

        }

        return null;
    }


    private int getIndexArraySearch(String nome){
        int i = 0;
        while (i < this.razao.length){
            if (this.razao[i].equals(nome) || this.nome[i].equals(nome))
                return i;
            i++;
        }
        return -1;
    }
}