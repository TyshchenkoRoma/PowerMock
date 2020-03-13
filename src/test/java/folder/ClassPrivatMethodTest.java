package folder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;

public class ClassPrivatMethodTest {

    private ClassPrivatMethod classPrivatMethod;
    private ClassPrivatMethod classPrivatMethod1;

    @Before
    public void setUp() {
        classPrivatMethod = PowerMockito.spy(new ClassPrivatMethod());
        classPrivatMethod1 = PowerMockito.spy(new ClassPrivatMethod());
    }

    @Test
    public void doNothinkNoReturmn() throws Exception {

        PowerMockito.doNothing().when(classPrivatMethod, "privatMethod");
        classPrivatMethod.pst();

        PowerMockito.verifyPrivate(classPrivatMethod,
                Mockito.times(1)).invoke("privatMethod");
    }

    @Test
    public void doNothinkReturmn() throws Exception {

        PowerMockito.doReturn("Test2").when(classPrivatMethod1, "privatMethod");
        classPrivatMethod1.pst1();
        System.out.println(classPrivatMethod1.pst1());

//        PowerMockito.verifyPrivate(classPrivatMethod1,
//                Mockito.times(1)).invoke("privatMethod");
    }

}
