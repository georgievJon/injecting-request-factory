package com.clouway.requestfactory.app.server;

import com.clouway.requestfactory.app.model.User;
import com.google.inject.Inject;

/**
 * @author Miroslav Genov (mgenov@gmail.com)
 */
public class UserService {
  private final User user;

  // TODO: non static invocation
  // TODO: replace original ServiceLayerDecorator with Guicey Decorator
  // TODO: Error handling using filter

  @Inject
  public UserService(User user) {
    this.user = user;
  }

  @SuppressWarnings("unused")
  public User getRandomUser() {
    return user;
  }
  @SuppressWarnings("unused")
  public void persist(User user) {
    System.out.println("User:" + user.getEmail() + ", " + user.getPassword());
  }
}
