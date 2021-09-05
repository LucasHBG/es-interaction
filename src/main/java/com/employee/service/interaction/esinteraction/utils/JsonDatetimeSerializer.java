package com.employee.service.interaction.esinteraction.utils;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * Classe para serializar datas do tipo Datetime
 * exemplo de serialização: 13/07/2004 at 14:33:02 BRT
 */
public class JsonDatetimeSerializer extends JsonSerializer<Date> {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("'Criado em' dd/MM/yyyy 'às' HH:mm:ss", new Locale("pt", "BR"));

    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
            throws IOException, JsonProcessingException {

        String formattedDate = dateFormat.format(date);

        jsonGenerator.writeString(formattedDate);
    }

}
