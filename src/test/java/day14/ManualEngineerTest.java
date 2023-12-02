package day14;

import junit.framework.Assert;
import org.example.classwork.day14.people.Engineer;
import org.example.classwork.day14.people.ManualEngineer;
import org.junit.Test;

public class ManualEngineerTest {
    Engineer manualEngineer = new ManualEngineer(20, 3);

    @Test
    public void testGetManualEngineerAge() {
        Assert.assertEquals("Wrong age", 20, manualEngineer.getAge());
    }

    @Test
    public void testGetManualEngineerExperience() {
        Assert.assertEquals("Wrong experience", 3, manualEngineer.getExperience());
    }

    @Test
    public void testGetManualEngineerSkill() {
        Assert.assertEquals("Wrong skill", 6, manualEngineer.getSkill());
    }


    @Test
    public void testSetManualEngineerAge() {
        manualEngineer.setAge(21);
        Assert.assertEquals("Wrong age", 21, manualEngineer.getAge());
    }

    @Test
    public void testSetManualEngineerExperience() {
        manualEngineer.setExperience(4);
        Assert.assertEquals("Wrong experience", 4, manualEngineer.getExperience());
    }

    @Test
    public void testSetManualEngineerSkill() {
        manualEngineer.setSkill(7);
        Assert.assertEquals("Wrong skill", 7, manualEngineer.getSkill());
    }

}
