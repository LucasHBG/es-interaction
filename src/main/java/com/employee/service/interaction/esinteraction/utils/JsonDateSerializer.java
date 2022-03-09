package com.employee.service.interaction.esinteraction.utils;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * Classe criada para formatar a data padrão do servidor backend 
 * ao receber solicitações  
 */
public class JsonDateSerializer extends JsonSerializer<Date> {

    //Trocando o tipo de data usada pelo sistema para dia/mes/ano
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
            throws IOException, JsonProcessingException {

        String formattedString = dateFormat.format(date);

        jsonGenerator.writeString(formattedString);
    }

}
