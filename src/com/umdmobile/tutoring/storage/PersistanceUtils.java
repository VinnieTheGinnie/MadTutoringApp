package com.umdmobile.tutoring.storage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import android.widget.ListAdapter;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.umdmobile.tutoring.structures.*;


// At the start of each method call, check that it is not running in the UI thread.
public class PersistanceUtils {
	
	// "Anonymous" user credentials. (should be using a Token Vending Machine)
	private static final String access_key_id = "AKIAISNYR3QPQJRWIOOQ";
	private static final String secret_key = "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";
	private static final String BUCKET = "umd-tutoring-app";

	// Private constructor ensures that this class can never be instantiated
	private PersistanceUtils() {}
	
	private static boolean uploadToBucket(String bucket, String data, String key) {
		
		AmazonS3Client s3Client = new AmazonS3Client(new BasicAWSCredentials(access_key_id, secret_key));
		
		ByteArrayInputStream input = new ByteArrayInputStream(data.getBytes());
		PutObjectRequest request = new PutObjectRequest(bucket, key, input, null);
		
		try {
			// Check that the bucket exists.
			if(!s3Client.doesBucketExist(bucket)) {
				return false;
			}
			s3Client.putObject(request);
			
		} catch (AmazonServiceException e) {
			Log.e("S3ERROR", "Error occured in S3 while processing request");
			return false;
		} catch (AmazonClientException e) {
			Log.e("S3ERROR","Error occured while making request of handling response");
			return false;
		}
		
		return true;
	}
	
	private static String downloadFromBucket(String bucket, String key) {
		AmazonS3Client s3Client = new AmazonS3Client(new BasicAWSCredentials(access_key_id, secret_key));
		StringBuilder builder = new StringBuilder();
		
		try {
			// Check that the bucket exists.
			if(!s3Client.doesBucketExist(bucket)) {
				return null;
			}
			S3Object s3Object = s3Client.getObject(bucket, key);
			InputStream input = s3Object.getObjectContent();
			int c;
			while( (c = input.read()) != -1) {
				builder.append((char) c);
			}
			
		} catch (AmazonServiceException e) {
			Log.e("S3ERROR", "Error occured in S3 while processing request");
			return null;
		} catch (AmazonClientException e) {
			Log.e("S3ERROR","Error occured while making request of handling response");
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return builder.toString();
	}
		
	public static Tutor getTutor(Context context, String uniqueId) {
		
		// Check that code is not running on the main thread
		if(Looper.myLooper() == Looper.getMainLooper()) {
			return null;
		}
		
		// Download the serialized string.
		String jsonString = downloadFromBucket(BUCKET, uniqueId);
		
		// Return the de-serialized Tutor object.
		return JSONMapper.readTutor(jsonString);
	}
	
	public static TA getTA(Context context, String uniqueId) {
		
		// Check that code is not running on the main thread
		if(Looper.myLooper() == Looper.getMainLooper()) {
			return null;
		}
		
		// Download the serialized string.
		String jsonString = downloadFromBucket(BUCKET, uniqueId);
		
		// Return the de-serialized TA object.
		return JSONMapper.readTA(jsonString);
	}
	
	public static Review getReview(Context context, String uniqueId) {
		
		// Check that code is not running on the main thread
		if(Looper.myLooper() == Looper.getMainLooper()) {
			return null;
		}
		
		// Download the serialized string.
		String jsonString = downloadFromBucket(BUCKET, uniqueId);
		
		// Return the de-serialized Review object.
		return JSONMapper.readReview(jsonString);
	}
	
	public static boolean putTutor(Context context, Tutor tutor) {
		
		// Check that code is not running on the main thread
		if(Looper.myLooper() == Looper.getMainLooper()) {
			return false;
		}
		
		// Serialize the Tutor
		String jsonString = JSONMapper.writeTutor(tutor);
		
		// Upload the serialized string
		return uploadToBucket(BUCKET, jsonString, tutor.getUniqueId() + "");
		
	}
	
	public static boolean putTA(Context context, TA ta) {
		
		// Check that code is not running on the main thread
		if(Looper.myLooper() == Looper.getMainLooper()) {
			return false;
		}
		
		// Serialize the TA
		String jsonString = JSONMapper.writeTA(ta);
		
		// Upload the serialized string
		return uploadToBucket(BUCKET, jsonString, ta.getUniqueId() + "");
		
	}
	
	public static boolean putReview(Context context, Review review) {
		
		// Check that code is not running on the main thread
		if(Looper.myLooper() == Looper.getMainLooper()) {
			return false;
		}
		
		// Serialize the TA
		String jsonString = JSONMapper.writeReview(reveiw);
		
		// Upload the serialized string
		return uploadToBucket(BUCKET, jsonString, review.getUniqueId() + "");
		
	}
	
	public static ListAdapter getListAdapter(Context context, String id) {
		// Check that code is not running on the main thread
		if(Looper.myLooper() == Looper.getMainLooper()) {
			return null;
		}
		
		
		
		return null;
		
	}
}
