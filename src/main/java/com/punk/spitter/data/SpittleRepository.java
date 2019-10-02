package com.punk.spitter.data;

import com.punk.spitter.Spittle;

import java.util.List;

public interface SpittleRepository {
    //返回count个对象 最大id为max
    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(long spittleId);

}
