package br.com.alura.minhasmusicas.principal.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto");
        } else {
            System.out.println(audio.getTitulo() + " também é um dos que todo mundo está " +
                    "curtindo");
        }
    }
}
