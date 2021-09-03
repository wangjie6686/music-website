package com.example.yin.service.impl;

import com.example.yin.dao.RankDao;
import com.example.yin.domain.Rank;
import com.example.yin.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RankServiceImpl implements RankService {

    @Autowired
    private RankDao rankDao;

    @Override
    public int rankOfSongListId(Long songListId) {
        return rankDao.selectScoreSum(songListId) / rankDao.selectRankNum(songListId);
    }

    @Override
    public boolean addRank(Rank rank) {

        return rankDao.insertSelective(rank) > 0 ? true:false;
    }
}
