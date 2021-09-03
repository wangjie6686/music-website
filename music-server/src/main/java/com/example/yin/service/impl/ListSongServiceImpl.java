package com.example.yin.service.impl;

import com.example.yin.dao.ListSongDao;
import com.example.yin.domain.ListSong;
import com.example.yin.service.ListSongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListSongServiceImpl implements ListSongService {

    @Autowired
    private ListSongDao listSongDao;

    @Override
    public List<ListSong> allListSong()
    {
        return listSongDao.allListSong();
    }

    @Override
    public boolean updateListSongMsg(ListSong listSong) {
        return listSongDao.updateListSongMsg(listSong) >0 ?true:false;
    }

    @Override
    public boolean deleteListSong(Integer songId) {
        return listSongDao.deleteListSong(songId) >0 ?true:false;
    }

    @Override
    public boolean addListSong(ListSong listSong)
    {
        return listSongDao.insertSelective(listSong) > 0?true:false;
    }

    @Override
    public List<ListSong> listSongOfSongId(Integer songListId)
    {
        return listSongDao.listSongOfSongId(songListId);
    }

}
