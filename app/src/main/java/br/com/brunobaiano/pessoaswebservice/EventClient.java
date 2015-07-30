package br.com.brunobaiano.pessoaswebservice;

import org.androidannotations.annotations.rest.Get;
import org.androidannotations.annotations.rest.Rest;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aluno on 29/07/2015.
 */
@Rest(rootUrl = "http://172.16.200.212:8080",converters= MappingJacksonHttpMessageConverter.class)
public interface EventClient {

    @Get("/pessoas")
    ArrayList<Pessoa> consultarPessoas();

    RestTemplate getRestTemplate();
}
