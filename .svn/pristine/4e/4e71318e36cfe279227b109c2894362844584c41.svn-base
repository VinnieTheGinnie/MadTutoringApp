package com.umdmobile.tutoring.storage;

import com.umdmobile.tutoring.structures.*;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * Write objects to/from JSON format.
 * @author luke valenta
 *
 */

public class JSONMapper {
	private static ObjectMapper mapper = new ObjectMapper();
	
	/**
	 * Write a TA object to JSON format
	 * 
	 * @param object The object to be written to JSON format
	 * @return A JSON string representing the object
	 */
	public static String writeTA(TA object) {
		String s = "";
		try {
			s = mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	/**
	 * Convert a JSON format string to a TA object
	 * @param jsonText The string representation of an object
	 * @return The object obtained from the JSON text
	 */
	public static TA readTA(String jsonText) {
		TA object = null;
		try {
			object = (TA) mapper.readValue(jsonText, TA.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}
		
	/**
	 * Write a Tutor object to JSON format
	 * 
	 * @param object The object to be written to JSON format
	 * @return A JSON string representing the object
	 */
	public static String writeTutor(Tutor object) {
		String s = "";
		try {
			s = mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	
	/**
	 * Convert a JSON format string to a Tutor object
	 * @param jsonText The string representation of an object
	 * @return The object obtained from the JSON text
	 */
	public static Tutor readTutor(String jsonText) {
		Tutor object = null;
		try {
			object = (Tutor) mapper.readValue(jsonText, Tutor.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}
	
	/**
	 * Write a Review object to JSON format
	 * 
	 * @param object The object to be written to JSON format
	 * @return A JSON string representing the object
	 */
	public static String writeReview(Review object) {
		String s = "";
		try {
			s = mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	
	/**
	 * Convert a JSON format string to a Review object
	 * @param jsonText The string representation of an object
	 * @return The object obtained from the JSON text
	 */
	public static Review readReview(String jsonText) {
		Review object = null;
		try {
			object = (Review) mapper.readValue(jsonText, Review.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}
	
	/**
	 * Write a TaOrTutorDictionary object to JSON format
	 * 
	 * @param object The object to be written to JSON format
	 * @return A JSON string representing the object
	 */
	public static String writeTaOrTutorDictionary(TaOrTutorDictionary object) {
		String s = "";
		try {
			s = mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	
	/**
	 * Convert a JSON format string to a TaOrTutorDictionary object
	 * @param jsonText The string representation of an object
	 * @return The object obtained from the JSON text
	 */
	public static TaOrTutorDictionary readTaOrTutorDictionary(String jsonText) {
		TaOrTutorDictionary object = null;
		try {
			object = (TaOrTutorDictionary) mapper.readValue(jsonText, TaOrTutorDictionary.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}
	
}
