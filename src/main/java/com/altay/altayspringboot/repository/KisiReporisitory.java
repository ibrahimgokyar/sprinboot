package com.altay.altayspringboot.repository;

import com.altay.altayspringboot.entity.Kisi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface KisiReporisitory extends JpaRepository<Kisi, Long> {
       List<Kisi> getAllByAd(String ad);
       Page<Kisi> findAll(Pageable pageAble);
}
