package org.kalu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;
import com.amazonaws.services.lambda.runtime.tests.annotations.Event;

public class AppTest {

    private SimpleHandler handler;
    private Context context;
    
    @BeforeEach
    public void init(){
        this.context= new TestContext();
        this.handler=new SimpleHandler();
    }
    @ParameterizedTest
    @Event(value = "sqs/sqs_event.json", type = SQSEvent.class)
    public void testInjectSQSEvent(SQSEvent event) {
       String response=this.handler.handleRequest("Romit",this.context);
       Assertions.assertEquals("ROMIT", response);
    }
}
