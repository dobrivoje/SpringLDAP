/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringInAction4Edition.aop;

import java.util.HashMap;
import java.util.Map;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author root
 */
@Aspect
public class TrackCounter {

    private final Map<Integer, Integer> trackCounts = new HashMap<>();

    @Pointcut("execution(* SpringInAction4Edition.ICompactDisc2.playTrack(int)) && args(trackNo)")
    public void trackPlayed(int trackNo) {
    }

    @Before("trackPlayed(trackNo)")
    public void countTrack(int trackNo) {
        trackCounts.put(trackNo, getTrackPlayed(trackNo) + 1);
    }

    public int getTrackPlayed(int trackNo) {
        return trackCounts.containsKey(trackNo) ? trackCounts.get(trackNo) : 0;
    }

}
