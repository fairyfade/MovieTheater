/**@purpose Create a room in the movie theater
 * @author Chloe Jones
 * @date 11/23/22
 */
package Movies;
public abstract class Room {
    private int totalSeats;
    private int roomNumber;

    /**@param totalSeats int, the total number of seats in the room
     * @param rNum int, the room nubmer
     */
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
