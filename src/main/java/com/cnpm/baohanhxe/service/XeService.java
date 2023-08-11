package com.cnpm.baohanhxe.service;

import com.cnpm.baohanhxe.entity.Xe;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface XeService {
    Page<Xe> findByTenXeContaining(String tenXe, Pageable pageable);

    List<Xe> findAll();

    List<Xe> findAll(Sort sort);

    List<Xe> findAllById(Iterable<Long> longs);

    <S extends Xe> List<S> saveAll(Iterable<S> entities);

    void flush();

    <S extends Xe> S saveAndFlush(S entity);

    <S extends Xe> List<S> saveAllAndFlush(Iterable<S> entities);

    @Deprecated
    void deleteInBatch(Iterable<Xe> entities);

    void deleteAllInBatch(Iterable<Xe> entities);

    void deleteAllByIdInBatch(Iterable<Long> longs);

    void deleteAllInBatch();

    @Deprecated
    Xe getOne(Long aLong);

    @Deprecated
    Xe getById(Long aLong);

    Xe getReferenceById(Long aLong);

    <S extends Xe> List<S> findAll(Example<S> example);

    <S extends Xe> List<S> findAll(Example<S> example, Sort sort);

    Page<Xe> findAll(Pageable pageable);

    <S extends Xe> S save(S entity);

    Optional<Xe> findById(Long aLong);

    boolean existsById(Long aLong);

    long count();

    void deleteById(Long aLong);

    void delete(Xe entity);

    void deleteAllById(Iterable<? extends Long> longs);

    void deleteAll(Iterable<? extends Xe> entities);

    void deleteAll();

    <S extends Xe> Optional<S> findOne(Example<S> example);

    <S extends Xe> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends Xe> long count(Example<S> example);

    <S extends Xe> boolean exists(Example<S> example);

    <S extends Xe, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
}
