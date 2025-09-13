import junit.framework.TestCase;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class RemoteControlTest extends TestCase {
    public void  testButtonWasPressed() {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = mock(Light.class);
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        simpleRemoteControl.setSlot(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();

        verify(light).on();
    }
}
