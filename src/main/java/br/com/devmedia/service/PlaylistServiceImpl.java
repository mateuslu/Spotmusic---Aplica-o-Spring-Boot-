package br.com.devmedia.service;

import br.com.devmedia.dao.PlaylistDao;
import br.com.devmedia.domain.Playlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PlaylistServiceImpl implements PlaylistService {

    @Autowired
    private PlaylistDao playlistDao;

    @Override
    public void salvar(Playlist playlist) {
    playlistDao.salvar(playlist);
    }

    @Override
    @Transactional
    public List<Playlist> recuperar() {
        return playlistDao.recuperar();
    }

    @Override
    @Transactional
    public Playlist recuperarPoiId(long id) {
        return playlistDao.recuperarPorID(id);
    }

    @Override
    public void atualizar(Playlist playlist) {
        playlistDao.atualizar(playlist);
    }

    @Override
    public void excluir(long id) {
        playlistDao.excluir(id);
    }
}
