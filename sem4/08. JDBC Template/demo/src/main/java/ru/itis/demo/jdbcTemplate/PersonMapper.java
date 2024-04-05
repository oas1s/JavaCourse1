package ru.itis.demo.jdbcTemplate;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Person.builder()
                .id(rs.getInt("id"))
                .name(rs.getString("name"))
                .email(rs.getString("email"))
                .age(rs.getInt("age"))
                .build();
    }
}
