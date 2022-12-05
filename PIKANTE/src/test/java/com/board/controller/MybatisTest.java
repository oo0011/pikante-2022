package com.board.controller;

import static org.junit.Assert.*;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml"})
public class MybatisTest {

@Inject 
DataSource dataSource;

@Test
public void testConnection() throws Exception {
	try (Connection connection = dataSource.getConnection()) {
		System.out.println(connection);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

}
