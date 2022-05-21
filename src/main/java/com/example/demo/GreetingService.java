/*************************************************************************
 * ADOBE CONFIDENTIAL
 * ___________________
 *
 * Copyright 2022 Adobe
 * All Rights Reserved.
 *
 * NOTICE: All information contained herein is, and remains
 * the property of Adobe and its suppliers, if any. The intellectual
 * and technical concepts contained herein are proprietary to Adobe
 * and its suppliers and are protected by all applicable intellectual
 * property laws, including trade secret and copyright laws.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Adobe.
 **************************************************************************/
package com.example.demo;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Token;
import com.newrelic.api.agent.Trace;
import org.springframework.stereotype.Component;

@Component
public class GreetingService {

  @Trace
  public String getGreeting(){
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return "Greetings from Spring Boot!";
  }

  @Trace(dispatcher = true, async = true)
  public String asyncGreeting(){
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return "Async greetings from Spring Boot!";
  }

  @Trace()
  public String nestedGreeting(){
    final Token token = NewRelic.getAgent().getTransaction().getToken();
    token.expire()
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return "Greetings from Spring Boot!";
  }
}
