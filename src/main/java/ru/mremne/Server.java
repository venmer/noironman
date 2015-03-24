package ru.mremne;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * autor:maksim
 * date: 25.03.15
 * time: 0:27.
 */
public class Server extends ResourceConfig {
   public Server(){
       packages(Server.class.getPackage().getName());
   }
}
