
import SpringInAction4Edition.ICompactDisc;
import SpringInAction4Edition.ICompactDisc2;
import SpringInAction4Edition.aop.TrackCounter;
import SpringInAction4Edition.beans.EKV;
import SpringInAction4Edition.beans.LepaBrena;
import SpringInAction4Edition.config.TraxCounterConfig;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
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
    private List<ICompactDisc> cds;

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

        List<ICompactDisc> expected = new ArrayList();
        ICompactDisc cd1, cd2;
        expected.add(cd1 = new EKV());
        expected.add(cd2 = new LepaBrena());

        assertEquals(expected.get(0), cd1);
        assertEquals(expected.get(1), cd2);
    }
}
