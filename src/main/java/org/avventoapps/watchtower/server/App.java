package org.avventoapps.watchtower.server;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@Getter
@AllArgsConstructor
public class App {
  private String name;
  private String port;
  private String version;
  private Instant buildTime;
}
