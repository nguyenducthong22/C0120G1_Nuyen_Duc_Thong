package com.codegym.employee.formatter;

import com.codegym.employee.Service.LevelService;
import com.codegym.employee.Service.PositionService;
import com.codegym.employee.model.Level;
import com.codegym.employee.model.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class LevelFormatter implements Formatter<Level> {
    @Autowired
    LevelService levelService;

    @Override
    public Level parse(String s, Locale locale) throws ParseException {
        return levelService.findById(Long.parseLong(s));
    }


    @Override
    public String print(Level level, Locale locale) {
        return String.format(
                "Province: [id=%d,name=%s]",
                level.getId(), level.getName()
        );
    }
}
