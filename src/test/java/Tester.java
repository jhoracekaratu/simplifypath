
import ke.co.mspace.twosum.Main;
import ke.co.mspace.twosum.Two_Sum_Solution;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnit44Runner;
import org.mockito.runners.MockitoJUnitRunner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author developer
 */
@RunWith(MockitoJUnitRunner.class)
public class Tester {
    @InjectMocks
    Main main=new Main();
    @Mock
    Two_Sum_Solution mymock;
    @Test
    public void testAdd(){
        Mockito.when(mymock.add(1, 2)).thenReturn(4);
        Assert.assertEquals(main.execAdd(1, 2), 3);
    }
    
}
