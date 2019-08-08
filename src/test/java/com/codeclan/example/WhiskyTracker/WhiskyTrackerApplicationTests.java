package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)


@SpringBootTest


public class WhiskyTrackerApplicationTests {

	@Autowired
	DistilleryRepository distilleryRepository;

	@Autowired
	WhiskyRepository whiskyRepository;



	@Test
	public void contextLoads() {
	}


	@Test
	public void canFindAllWhiskiesForYear(){
		List<Whisky> found = whiskyRepository.findWhiskysByYear(2018);
		assertEquals("The Glendronach Revival", found.get(0).getName());
		assertEquals("The Glendronach Original", found.get(1).getName());

	}

	@Test
	public void canGetDistilleriesForHighlandRegion() {
		List<Distillery> found = distilleryRepository.findDistilleriesByRegion("Highland");
		assertEquals(1, found.size());
	}

	@Test
	public void canGetWhiskiesByDistilleryAndAge(){
		List<Whisky> found = whiskyRepository.findWhiskyByDistilleryAndAge();
		assertEquals();
	}



}
