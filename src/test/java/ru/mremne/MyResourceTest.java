package ru.mremne;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;
import ru.mremne.resources.MyResource;

import javax.ws.rs.core.Application;

import static junit.framework.Assert.assertEquals;

/**
 * autor:maksim
 * date: 23.03.15
 * time: 16:21.
 */
public class MyResourceTest  extends JerseyTest{

    @Override
    protected Application configure() {
        return new ResourceConfig(MyResource.class);
    }
    @Test
    public void getItTest(){
        final String responceMsg=target().path("/").request().get(String.class);
        assertEquals("I am iron man!",responceMsg);
    }

}
