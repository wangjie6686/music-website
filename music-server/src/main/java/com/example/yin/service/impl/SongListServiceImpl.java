package com.example.yin.service.impl;

import com.example.yin.dao.SongListDao;
import com.example.yin.domain.SongList;
import com.example.yin.service.SongListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongListServiceImpl implements SongListService {

    @Autowired
    private SongListDao songListDao;

    @Override
    public boolean updateSongListMsg(SongList songList) {
        return songListDao.updateSongListMsg(songList) >0 ?true:false;
    }

    @Override
    public boolean deleteSongList(Integer id) {
        return songListDao.deleteSongList(id) >0 ?true:false;
    }

    @Override
    public List<SongList> allSongList()
    {
        return songListDao.allSongList();
    }

    @Override
    public List<SongList> likeTitle(String title)
    {
        return songListDao.likeTitle(title);
    }

    @Override
    public List<SongList> likeStyle(String style)
    {
        return songListDao.likeStyle(style);
    }

    @Override
    public List<SongList> songListOfTitle(String title)
    {
        return songListDao.songListOfTitle(title);
    }

    @Override
    public boolean addSongList(SongList songList)
    {
        return songListDao.insertSelective(songList) > 0?true:false;
    }

    @Override
    public boolean updateSongListImg(SongList songList) {

        return songListDao.updateSongListImg(songList) >0 ?true:false;
    }
}
