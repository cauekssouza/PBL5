public class evento {
    protected String artista;
    protected String albumOrSingle;
    protected String duracao;
    protected String genero;
    protected String local;
    protected String data;

    // Constructor
    public evento(String artista, String albumOrSingle, String duracao, String genero, String local, String data) {
        this.artista = artista;
        this.albumOrSingle = albumOrSingle;
        this.duracao = duracao;
        this.genero = genero;
        this.local = local;
        this.data = data;
    }

    /* Getters and Setters */
    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbumOrSingle() {
        return albumOrSingle;
    }

    public void setAlbumOrSingle(String albumOrSingle) {
        this.albumOrSingle = albumOrSingle;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

