package business.converter.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.reflect.FieldUtils;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.apache.commons.lang3.reflect.FieldUtils.*;

public abstract class BaseResultConverterImpl <Tin,Tout> implements BaseResultConverter<Tin,Tout>{
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Tout convertStandart(Tin entity, Tout result) {
        HashMap entityInfo = objectMapper.convertValue(entity,HashMap.class);
        HashMap resultInfo = objectMapper.convertValue(result,HashMap.class);
        entityInfo.forEach((key,value)-> {
            try {

                if (resultInfo.containsKey(key)) {
                    writeField(result,(String) key,value,true);
                }
            } catch (IllegalAccessException e) {
                System.out.println(e);
            }
        });
        System.out.println();
        return result;
    }

    @Override
    public abstract Tout convertSpecific(Tin entity, Tout result);
}
