package com.codegym.employee.formatter;

import com.codegym.employee.Service.PositionService;
import com.codegym.employee.model.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class PositionFormatter implements Formatter<Position> {
    @Autowired
    PositionService positionService;

    @Override
    public Position parse(String s, Locale locale) throws ParseException {
        return positionService.findByid(Long.parseLong(s));
    }

    @Override
    public String print(Position position, Locale locale) {
        return String.format(
                "Province: [id=%d,name=%s]",
                position.getId(), position.getName()
        );
    }
}
