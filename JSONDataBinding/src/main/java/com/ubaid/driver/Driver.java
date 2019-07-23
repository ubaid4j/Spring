package com.ubaid.driver;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ubaid.entity.Student;

public class Driver
{

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper mapper = new ObjectMapper();
		
		Student st1 = mapper.readValue(new File("data/simple.json"), Student.class);
		
		System.out.println(st1);
	}

}
