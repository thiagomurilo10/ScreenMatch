package br.com.alura.screenmatch.novoDesafio;

public class Teste {
    public static void main(String[] args) {
        // variaveis e metodos implementados buscando a utilização da herança

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("KISS");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Galáxia");
        meuPodcast.setApresentador("Space Today");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas prefer = new MinhasPreferidas();
        prefer.inclui(meuPodcast);
        prefer.inclui(minhaMusica);
    }
}
