package sample;

public class CesarCifras {

    public final char [] cara = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' ','?','.',','};


    public String decode(String texto, int casas) {

        int x = 0;
        String decode = "";

        String textoMin = texto.toLowerCase();

        for(int i=0; i < textoMin.length(); i++) {

            while(textoMin.charAt(i) != cara[x]) {
                x++;
            }
            if(x < casas) {
                x = x + 26;
                decode = decode + cara[x-casas];
            }else {

                if(x >= 26) {
                    decode = decode + cara[x];
                }else {
                    decode = decode + cara[x - casas];
                }
            }
            x = 0;
        }
        return decode;
    }

    public String encode(String texto, int casas) {

        int x = 0;
        String encode = "";

        String textoMin = texto.toLowerCase();

        for(int i=0; i < textoMin.length(); i++) {

            while(textoMin.charAt(i) != cara[x]) {
                x++;
            }
            if(x < 14) {
                encode = encode + cara[x + casas];
            }else {

                if(x >= 26) {
                    encode = encode + cara[x];
                }else {
                    x = (x + casas) - 26;
                    encode = encode + cara[x];
                }
            }
            x = 0;
        }
        return encode;
    }


}
