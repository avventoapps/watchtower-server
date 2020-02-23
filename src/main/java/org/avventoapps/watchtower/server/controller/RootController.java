package org.avventoapps.watchtower.server.controller;

import org.avventoapps.watchtower.server.App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/", produces = { "application/json"})
public class RootController {

  @Autowired
  protected BuildProperties props;

  @Autowired
  protected Environment env;

  @RequestMapping("/info")
  public App getAppDescription() {
    return new App(props.getName(), env.getProperty("server.port"), props.getVersion(), props.getTime());
  }
}
