

public class Main{
    public static void main(String[] args) {

        //1
        // System.out.println(invertirTexto("Hola"));

        //3
        //System.out.println(vecesSubCadena(“Estamos viviendo en un submarino amarillo. No tenemos nada que hacer. En el interior del submarino se está muy apretado. Así que estamos leyendo todo el día. Vamos a salir en 5 días"., "en"));

        //4
        //System.out.println(vecesSubCadena2("Estamos viviendo en un submarino amarillo. No tenemos nada que hacer. En el interior del submarino se está muy apretado. Así que estamos leyendo todo el día. Vamos a salir en 5 días.", "En"));

        //5
        //System.out.println(pasarMayusculaSubCadena("Estamos viviendo en un <mayus>submarino amarillo</mayus>. No tenemos <mayus>nada</mayus> qué hacer"));

        //8
        String[] urlSeparada = separarUrl("http://www.devbg.org/forum/index.php");
        for (String i:urlSeparada){
            System.out.println(i);
        }
    }

    //1
    public static String invertirTexto(String texto){
        String textoInvertido = "";
        for(int i = texto.length()-1;i>=0 ;i--){
            textoInvertido += texto.charAt(i);
        }
        return textoInvertido;
    }


    //3
    public static int vecesSubCadena(String cadena, String subcadena){
        int n = 0;
        String[] cadenaSeparada = cadena.split(" ");
        for(String i: cadenaSeparada){
            if(i.indexOf(subcadena) != -1){
                n++;
            }
        }
        return n;
    }

    //4
    public static int vecesSubCadena2(String cadena, String subcadena){
        int n = 0;
        String[] cadenaSeparada = (cadena.toLowerCase()).split(" ");
        for(String i: cadenaSeparada){
            if(i.indexOf(subcadena.toLowerCase()) != -1){
                n++;
            }
        }
        return n;
    }

    //5
    public static String pasarMayusculaSubCadena(String texto){
        StringBuilder textoModificado = new StringBuilder();

        for (int i = 0; i < texto.length(); ){
            int indiceApertura = texto.indexOf("<mayus>", i);
            if (indiceApertura == -1){
                textoModificado .append(texto, i, texto.length()-1);
                return textoModificado.toString();
            }

            textoModificado.append(texto, i, indiceApertura);

            //Saltamos al final de la etiqueta <mayus>
            i = indiceApertura + 7;

            int indiceCierre = texto.indexOf("</mayus>", i);

            if (indiceCierre != -1){
                textoModificado.append(texto.substring(i, indiceCierre).toUpperCase());
            } else {
                textoModificado.append(texto.substring(i, texto.length() - 1).toUpperCase());
                return textoModificado.toString();
            }

            //salta despues de la etiqueta de cierre
            i=indiceCierre + 8;

        }


        return textoModificado.toString();
    }

    //8
    public static String[] separarUrl(String url){
        String[] urlSeparada = new String[3];

        //Aisla y asigna la primera parte
        //->http<-://
        urlSeparada[0] = url.split("://")[0];

        //Aisla y separa la direccion por /
        //https://www.devbg.org/forum/index.pxp
        //[0]  [1]     [2]      [3]     [4]
        String[] urlSplitAuxiliar = url.split("/");
        //Añade el dominio
        urlSeparada[1] = urlSplitAuxiliar[2];
        //Elimina el valor null del array[2]
        urlSeparada[2] = "";
        //Va añadiendo lo restante y las / entre cada casilla
        for (int i = 3; i<urlSplitAuxiliar.length;i++){
            urlSeparada[2] += urlSplitAuxiliar[i];
            //Si es el ultimo campo no añade /
            if(i != urlSplitAuxiliar.length -1){
                urlSeparada[2]+= "/";
            }
        }

        return urlSeparada;
    }
}