package com.altay.altayspringboot.service.impl;

import com.altay.altayspringboot.dto.KisiDTO;
import com.altay.altayspringboot.entity.Kisi;
import com.altay.altayspringboot.repository.KisiReporisitory;
import com.altay.altayspringboot.service.KisiService;
import com.altay.altayspringboot.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class KisiServiceImpl implements KisiService {
   // runtime de kisirepository nin değerlerini değiştirmeyi engellemiş oluyoruz.
    private final KisiReporisitory kisiReporisitory;
    private final ModelMapper modelMapper;

    KisiServiceImpl(KisiReporisitory kisiReporisitory, ModelMapper modelMapper)
    {
        this.kisiReporisitory = kisiReporisitory;
        this.modelMapper = modelMapper;
    }


    // servis katmanı dışında hiçbir katmanda dto lar ile haberleşmiyoruz
    // servisi dışarıya açtığımız kısımlarda dto ile çalışıyoruz
    // böylece entity leri hiçbir zaman dışarıdaki servislere açmamış oluyoruz.
    @Override
    public KisiDTO save(KisiDTO kisi) {
        if(kisi.getAd()==null)
        {
            throw  new IllegalArgumentException("hatali kayit");
        }
        Kisi kisidto = modelMapper.map(kisi,Kisi.class);
         kisidto = kisiReporisitory.save(kisidto);
        return modelMapper.map(kisidto,KisiDTO.class);

    }

    @Override
    public KisiDTO getById(Long id) {
        //final olduğu için değeri değiştirilemez hatası veriyor
        //kisiReporisitory = null;
        kisiReporisitory.getOne(id);
        return null;
    }

    @Override
    public TPage<KisiDTO> getAllPageable(Pageable pageable) {
       Page<Kisi> data =  kisiReporisitory.findAll(pageable);
       TPage page = new TPage<KisiDTO>();
       KisiDTO[] dtos = modelMapper.map(data.getContent(),KisiDTO[].class);
       page.setStat(data, Arrays.asList(dtos));
       return page;

    }
}
