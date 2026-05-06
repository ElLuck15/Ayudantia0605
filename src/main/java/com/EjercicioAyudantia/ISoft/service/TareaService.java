package com.EjercicioAyudantia.ISoft.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TareaService {
    private final RestTemplate restTemplate = new RestTemplate();
}
