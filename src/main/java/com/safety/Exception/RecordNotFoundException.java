package com.safety.Exception;

public class RecordNotFoundException extends RuntimeException{
	
	private static final long serialVersionUId=1L;
	public RecordNotFoundException(String str)
	{
		super(str);
	}

}
