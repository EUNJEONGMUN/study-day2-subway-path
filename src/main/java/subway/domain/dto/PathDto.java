package subway.domain.dto;

import java.util.List;

public class PathDto {
    public static final int DISTANCE_INDEX = 0;
    public static final int TIME_INDEX = 1;

    private final int totalDistance;
    private final int totalTime;
    private final List<String> path;

    public PathDto(List<Integer> totalDiatanceAndTime, List<String> path) {
        this.totalDistance = totalDiatanceAndTime.get(DISTANCE_INDEX);
        this.totalTime = totalDiatanceAndTime.get(TIME_INDEX);
        this.path = path;
    }

    public int getTotalDistance() {
        return totalDistance;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public List<String> getPath() {
        return path;
    }
}
