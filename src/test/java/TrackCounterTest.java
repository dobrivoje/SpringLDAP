
import SpringInAction4Edition.ICompactDisc;
import SpringInAction4Edition.ICompactDisc2;
import SpringInAction4Edition.aop.TrackCounter;
import SpringInAction4Edition.beans.EKV;
import SpringInAction4Edition.beans.LepaBrena;
import SpringInAction4Edition.config.TraxCounterConfig;
import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author root
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TraxCounterConfig.class})
public class TrackCounterTest {

    @Autowired
    private ICompactDisc2 cd;

    @Autowired
    private TrackCounter counter;

    @Autowired
    private Set<ICompactDisc> cds;

    @Test
    public void testTackCounters() {
        cd.playTrack(0);
        cd.playTrack(1);
        cd.playTrack(2);
        cd.playTrack(0);
        cd.playTrack(0);
        cd.playTrack(0);
        cd.playTrack(2);

        assertEquals(4, counter.getTrackPlayed(0));
        assertEquals(1, counter.getTrackPlayed(1));
        assertEquals(2, counter.getTrackPlayed(2));

        Set<ICompactDisc> expected = new HashSet<>();
        ICompactDisc cd1, cd2;

        expected.add(cd1 = new EKV());
        expected.add(cd2 = new LepaBrena());

        assertNotNull(expected);
        assertNotNull(cds);

        System.err.println("************************************************************");
        System.err.println(cds);
        
        assertEquals(EKV.class, cd1.getClass());
        assertEquals(LepaBrena.class, cd2.getClass());
    }
}
