package com.esi.mspellerin.proxy;

import com.esi.mspellerin.model.Hotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-hotel", url = "localhost:9092")
public interface HotelProxy {

    @GetMapping("/hotels/{id}")
    public Hotel getHotel(@PathVariable("id") Long idh);
}
