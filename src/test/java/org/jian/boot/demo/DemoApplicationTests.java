package org.jian.boot.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;
import java.net.URLClassLoader;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        //Get the URLs
        URL[] paths = ((URLClassLoader)classLoader).getURLs();
        for(int i=0; i< paths.length; i++)
        {
            System.out.println(paths[i].getFile());
        }
    }

}
