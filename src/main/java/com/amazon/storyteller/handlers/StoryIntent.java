package com.amazon.storyteller.handlers;

import static com.amazon.ask.request.Predicates.intentName;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

public class StoryIntent implements RequestHandler{

	@Override
	public boolean canHandle(HandlerInput input) {
		return input.matches(intentName("StoryIntent"));
	}

	@Override
	public Optional<Response> handle(HandlerInput input) {
		 String speechText = "आप कौन सी कहानी सुनना पसंद करेंगे?";
		// boolean noAnswerProvided = false;
		 
		 return input.getResponseBuilder()
	                .withSimpleCard("ColorSession", speechText)
	                .withSpeech(speechText)
	                .build();
		 
	}

}
