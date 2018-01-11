
public class Boat_01 {



	int direction_x = 0;
	int direction_y = 0;
	int speed_x = 0;
	int speed_y = 0;
	
	public void move_x_forward() {
		speed_x++;
		position_x = 1;
	}
	
	public void move_x_backward() {
		speed_x--;
		position_x = 0;
	}
	
	public void move_y_forward() {
		speed_y++;
		position_y = 1;
	}
	
	public void move_y_backward() {
		speed_y--;
		position_y = 0;
	}
}