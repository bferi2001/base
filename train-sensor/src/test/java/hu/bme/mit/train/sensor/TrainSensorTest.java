package hu.bme.mit.train.sensor;

import hu.bme.mit.train.controller.TrainControllerImpl;
import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;
import hu.bme.mit.train.user.TrainUserImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TrainSensorTest {
    TrainController controller;

    TrainUser user;
    TrainSensor sensor;
    @Before
    public void before() {
        controller = new TrainControllerImpl();
        user = new TrainUserImpl(controller);

        sensor=new TrainSensorImpl(controller, user);

    }

    @Test
    public void ThisIsAnExampleTestStub() {
        // TODO Delete this and add test cases based on the issues
    }

    @Test
    public void guavaTest() {
        sensor.AddToTachograph();
        Assert.assertEquals(1, sensor.getTachographSize());
    }
}
