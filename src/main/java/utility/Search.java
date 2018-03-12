package utility;

import java.util.ArrayList;
import java.util.List;

import com.garreffd.entity.PollData;

public class Search {
	public static List<PollData> pollData(List<PollData> pollData, int pollId) {
		List<PollData> extractedPolls = new ArrayList<PollData>();
		
		for(PollData p : pollData) {
			if(p.getPollId() == pollId) {

				extractedPolls.add(p);
			}
		}
		return extractedPolls;
	}
}
