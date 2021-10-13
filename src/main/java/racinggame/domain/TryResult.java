package racinggame.domain;

public class TryResult {
    private final CarName carName;
    private final Position position;

    private TryResult(CarName carName, Position position) {
        this.carName = carName;
        this.position = position;
    }

    public static TryResult of(CarName carName, Position position) {
        return new TryResult(carName, position);
    }

    public String getCarName() {
        return carName.getName();
    }

    public int getPosition() {
        return position.getPosition();
    }

    public String draw() {
        StringBuilder builder = new StringBuilder();
        for (int i=0 ; i < getPosition() ; i++) {
            builder.append("-");
        }
        return builder.toString();
    }

    public boolean isSamePosition(Position maxPosition) {
        return position.equals(maxPosition);
    }
}
