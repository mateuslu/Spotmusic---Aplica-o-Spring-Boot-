package br.com.devmedia.service;

import br.com.devmedia.domain.Musica;

import java.util.List;

public interface MusicaService {

    void salvar (Musica musica, long playListId);
    List<Musica> recuperarPorPlaylist(long playlistId);
    Musica recuperarPorPlaylistIdEMusicaId(long playlistId, long musicaId);
    void atualizar(Musica musica, long playlistId);
    void excluir(long playlistId, long musicaId);

}
