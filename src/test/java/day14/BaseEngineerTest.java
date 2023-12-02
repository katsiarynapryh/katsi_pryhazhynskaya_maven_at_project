package day14;

import org.example.classwork.day14.people.AutomatedEngineer;
import org.example.classwork.day14.people.Engineer;
import org.example.classwork.day14.people.ManualEngineer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BaseEngineerTest {
    private Engineer en;
    private int expSkill;
    private int expAge;
    private int expExperience;

    public BaseEngineerTest(Engineer en, int expSkill) {
        this.en = en;
        this.expSkill = expSkill;
        this.expAge = expAge;
        this.expExperience = expExperience;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(
                new Object[][]{
                        {new AutomatedEngineer(24, 10), 30},
                        {new ManualEngineer(24, 10), 20}
                }
        );
    }

    @Test
    public void checkDefaultAge(){
        assertEquals("The age is not correct!", expAge, en.getAge());
    }

    @Test
    public void checkDefaultSkill(){
        assertEquals("The skill is not correct!", expSkill, en.getSkill());
    }

    @Before
    public void printString() {
        System.out.println("you test");
    }

}
