package br.com.devmedia.service;

import br.com.devmedia.domain.Playlist;

import java.util.List;

public interface PlaylistService {

    void salvar(Playlist playlist);
    List<Playlist> recuperar();
    Playlist recuperarPoiId(long id);
    void atualizar(Playlist playlist);
    void excluir(long id);
}
