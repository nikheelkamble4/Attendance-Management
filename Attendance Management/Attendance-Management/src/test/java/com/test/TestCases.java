package com.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.Repository.UserRepository;
import com.test.model.User;
import com.test.service.UserService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestCases 
{
	@Autowired
	private UserService service;
	
	@MockBean
	private UserRepository repository;
	
	@Test
	public void listAllTest()
	{
		when(repository.findAll()).thenReturn(Stream
						.of(new User(1, "Mon", "Mon", "Bgm", "480"), 
							new User(2, "Roro", "ro", "Blr", "400")).collect(Collectors.toList()));
		assertEquals(2, service.listAll().size());
	}
	
	@Test
	public void saveTest()
	{
		User p1 = new User(3, "Ace", "ace", "Bgm", "480");
		service.save(p1);
		verify(repository, times(1)).save(p1);
	}
	
	@Test
	public void updateTest()
	{
		User p1 = new User(3, "Ace", "aced", "Bgm", "480");
		service.save(p1);
		verify(repository, times(1)).save(p1);
	}
	
	@Test
	public void deleteTest()
	{
		int id = 1;
		service.delete(id);
		verify(repository, times(1)).deleteById(id);
	}
}
