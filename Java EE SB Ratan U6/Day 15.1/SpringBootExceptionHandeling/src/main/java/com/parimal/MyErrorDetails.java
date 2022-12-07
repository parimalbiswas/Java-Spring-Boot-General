package com.parimal;

import java.time.LocalDateTime;

public class MyErrorDetails
{
	private LocalDateTime timestamp;
	private String messages;
	private String details;

	public MyErrorDetails()
	{
		// TODO Auto-generated constructor stub
	}

	public MyErrorDetails(LocalDateTime timestamp, String messages, String details)
	{
		super();
		this.timestamp = timestamp;
		this.messages = messages;
		this.details = details;
	}

	public LocalDateTime getTimestamp()
	{
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp)
	{
		this.timestamp = timestamp;
	}

	public String getMessages()
	{
		return messages;
	}

	public void setMessages(String messages)
	{
		this.messages = messages;
	}

	public String getDetails()
	{
		return details;
	}

	public void setDetails(String details)
	{
		this.details = details;
	}

	@Override
	public String toString()
	{
		return "MyErrorDetails [timestamp=" + timestamp + ", messages=" + messages + ", details=" + details + "]";
	}

}
