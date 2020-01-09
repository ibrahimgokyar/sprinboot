package com.altay.altayspringboot.service;

import com.altay.altayspringboot.dto.KisiDTO;
import com.altay.altayspringboot.entity.Kisi;
import com.altay.altayspringboot.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface KisiService {

    KisiDTO save (KisiDTO kisi);

    KisiDTO getById(Long id);

    TPage<KisiDTO> getAllPageable(Pageable pageable);
}
