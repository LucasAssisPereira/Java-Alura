package br.com.alura.minhasmusicas.principal.principal;

import br.com.alura.minhasmusicas.principal.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.principal.modelos.Musica;
import br.com.alura.minhasmusicas.principal.modelos.Podcast;

import java.nio.channels.MulticastChannel;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");

        for (int i = 0; i < 1000; i++){
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 50; i++){
            minhaMusica.curte();
        }


        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 5000; i++){
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 1000; i++){
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}
