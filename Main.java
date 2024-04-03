public class Main {
    public static void main(String[] args) {
        Spotify spotify = new Spotify("Taylor Swift", "Anti-Hero", "3:20", "Swift", 2, "Eras Tour Filme");

        // Displaying Spotify details
        System.out.println("Spotify:");
        System.out.println("Artista: " + spotify.getArtista());
        System.out.println("Álbum ou Single: " + spotify.getAlbumOrSingle());
        System.out.println("Duração: " + spotify.getDuracao());
        System.out.println("Playlist: " + spotify.getPlaylist());
        System.out.println("Artista Merch: " + spotify.getArtistaMerch());
        System.out.println("Evento: " + spotify.getEvento());
        System.out.println(); // Adding a blank line

        
        playlist playlist = new playlist("Beyonce", "Cowboy Carter", "1:18", "Country", 2, "New York", "2024-09-19", 10, "Album de Beyonce act ll", 27);

        
        System.out.println("Playlist:");
        System.out.println("Artista: " + playlist.getArtista());
        System.out.println("Álbum ou Single: " + playlist.getAlbumOrSingle());
        System.out.println("Duração: " + playlist.getDuracao());
        System.out.println("Playlist: " + playlist.getPlaylist());
        System.out.println("Artista Merch: " + playlist.getArtistaMerch());
        System.out.println("Evento: " + playlist.getEvento());
        System.out.println("Descrição: " + playlist.getDescricao());
        System.out.println("Número de Músicas: " + playlist.getNumeroDeMusicasPlaylist());
        System.out.println(); // Adding a blank line

       
        Musica musica = new Musica("Dua Lipa", "Training Sesson", "3:29", "Pop", "Berlim", "Radical Optimism", 11);

        System.out.println("Musica:");
        System.out.println("Artista: " + musica.getArtista());
        System.out.println("Álbum ou Single: " + musica.getAlbumOrSingle());
        System.out.println("Duração: " + musica.getDuracao());
        System.out.println("Playlist: " + musica.getPlaylist());
        System.out.println("Artista Merch: " + musica.getArtistaMerch());
        System.out.println("Evento: " + musica.getEvento());
        System.out.println(); // Adding a blank line

     
        evento evento = new evento("Olivia Rodrigo", "Vampire", "3:39", "Pop", "Brasil", "2024-09-19");

        
        System.out.println("Evento:");
        System.out.println("Artista: " + evento.getArtista());
        System.out.println("Álbum ou Single: " + evento.getAlbumOrSingle());
        System.out.println("Duração: " + evento.getDuracao());
        System.out.println("Local: " + evento.getLocal());
        System.out.println("Data: " + evento.getData());
    }
}
