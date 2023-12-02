package day14;

import junit.framework.Assert;
import org.example.classwork.day14.people.AutomatedEngineer;
import org.example.classwork.day14.people.Engineer;
import org.example.classwork.day14.people.ManualEngineer;
import org.junit.Test;

public class AutomatedEngineerTest {

    Engineer automatedEngineer = new AutomatedEngineer(22, 6);
    @Test
    public void testGetAutomatedEngineerAge() {
        Assert.assertEquals("Wrong age", 22, automatedEngineer.getAge());
    }

    @Test
    public void testGetAutomatedEngineerExperience() {
        Assert.assertEquals("Wrong experience", 6, automatedEngineer.getExperience());
    }

    @Test
    public void testGetAutomatedEngineerSkill() {
        Assert.assertEquals("Wrong skill", 18, automatedEngineer.getSkill());
    }


    @Test
    public void testSetAutomatedEngineerAge() {
        automatedEngineer.setAge(21);
        Assert.assertEquals("Wrong age", 21, automatedEngineer.getAge());
    }

    @Test
    public void testSetAutomatedEngineerExperience() {
        automatedEngineer.setExperience(7);
        Assert.assertEquals("Wrong experience", 7, automatedEngineer.getExperience());
    }

    @Test
    public void testSetAutomatedEngineerSkill() {
        automatedEngineer.setSkill(20);
        Assert.assertEquals("Wrong skill", 20, automatedEngineer.getSkill());
    }


}
