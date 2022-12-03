package Movies;
public abstract class Room {
    private int totalSeats;
    private int roomNumber;

    public Room(int totalSeats, int rNum) {
            this.roomNumber = rNum;
            this.totalSeats = totalSeats;
        }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }
}
