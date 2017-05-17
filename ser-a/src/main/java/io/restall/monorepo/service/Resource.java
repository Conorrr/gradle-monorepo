package io.restall.monorepo.service;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import io.restall.monorepo.libb.Service;
import org.springframework.stereotype.Component;

@Component
@Path("/hello")
public class Resource {

  private final Service service;

  @Inject
  public Resource(Service service) {
    this.service = service;
  }

  @GET
  public String message() {
    return "Hello " + this.service.message();
  }

}
