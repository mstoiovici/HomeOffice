import com.example.restfull_home_office_test.LowestCommonAncestorSolution1;
import org.junit.Assert;
import org.junit.Test;

public class LowestCommonAncestorSolution1Test  {
    private final LowestCommonAncestorSolution1 solution = new LowestCommonAncestorSolution1();

    @Test
    public void equalIndexes() {
        Assert.assertEquals(1, solution.run(1,1));
    }

    @Test
    public void rootAndDeepestIndex() {
        Assert.assertEquals(1, solution.run(1,1000000));
    }

    @Test
    public void extremesIndexesAndSameLevel() {
        Assert.assertEquals(1, solution.run(32,63));
    }

    @Test
    public void extremesIndexesAndDifferentLevel() {
        Assert.assertEquals(1, solution.run(16,63));
    }

    @Test
    public void sameLevelIndexesAndDifferentRootSubtrees() {
        Assert.assertEquals(1, solution.run(19,27));
    }

    @Test
    public void sameLevelIndexesOnRootLeftSubtree() {
        Assert.assertEquals(2, solution.run(34,44));
    }

    @Test
    public void sameLevelIndexesWithOneExtremeIndex() {
        Assert.assertEquals(1, solution.run(32,63));
    }

    @Test
    public void differentLevelIndexesAndDifferentRootSubtrees() {
        Assert.assertEquals(1, solution.run(9,53));
    }

    @Test
    public void differentLevelIndexesOnRootRightSubtree() {
        Assert.assertEquals(3, solution.run(61,25));
    }

    @Test
    public void directChildrenNodes() {
        Assert.assertEquals(5, solution.run(10,11));
    }

}