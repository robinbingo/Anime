package xyz.robinbingo.anime.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.robinbingo.anime.mapper.TAnimeMapper;
import xyz.robinbingo.anime.model.TAnime;
import xyz.robinbingo.anime.model.TAnimeExample;
import xyz.robinbingo.anime.service.TAnimeService;

import java.util.List;

/**
 * @author Robin
 * @create 2018-01-03 10:38
 * @desc
 **/
@Service
public class TAnimeServiceImpl implements TAnimeService {

    @Autowired
    private TAnimeMapper animeMapper;

    @Override
    public long countByExample(TAnimeExample example) {
        return animeMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TAnimeExample example) {
        return animeMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return animeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TAnime record) {
        return animeMapper.insert(record);
    }

    @Override
    public int insertSelective(TAnime record) {
        return animeMapper.insertSelective(record);
    }

    @Override
    public List<TAnime> selectByExample(TAnimeExample example) {
        return animeMapper.selectByExample(example);
    }

    @Override
    public TAnime selectByPrimaryKey(Integer id) {
        return animeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TAnime record, TAnimeExample example) {
        return animeMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TAnime record, TAnimeExample example) {
        return animeMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TAnime record) {
        return animeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TAnime record) {
        return animeMapper.updateByPrimaryKey(record);
    }
}
