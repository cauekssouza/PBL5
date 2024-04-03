class Playlist extends Spotify {
    private String descricao;
    private int numeroDeMusicas;

    public Playlist(String artista, String albumOrSingle, int duracao, String playlist, int artistaMerch, String evento, String descricao, int numeroDeMusicas) {
        super(artista, albumOrSingle, duracao, playlist, artistaMerch, evento);
        this.descricao = descricao;
        this.numeroDeMusicas = numeroDeMusicas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumeroDeMusicas() {
        return numeroDeMusicas;
    }

    public void setNumeroDeMusicas(int numeroDeMusicas) {
        this.numeroDeMusicas = numeroDeMusicas;
    }
}
