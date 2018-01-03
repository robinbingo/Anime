package xyz.robinbingo.anime.mapper;

import org.apache.ibatis.annotations.Param;
import xyz.robinbingo.anime.model.TAnime;
import xyz.robinbingo.anime.model.TAnimeExample;

import java.util.List;

public interface TAnimeMapper {
    long countByExample(TAnimeExample example);

    int deleteByExample(TAnimeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TAnime record);

    int insertSelective(TAnime record);

    List<TAnime> selectByExample(TAnimeExample example);

    TAnime selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TAnime record, @Param("example") TAnimeExample example);

    int updateByExample(@Param("record") TAnime record, @Param("example") TAnimeExample example);

    int updateByPrimaryKeySelective(TAnime record);

    int updateByPrimaryKey(TAnime record);
}