
public class Shape_01 {


	int direction_x = 0;
	int direction_y = 0;
	int turn_x = 0;
	int turn_y = 0;
	
	public void move_x_forward() {
		turn_x = 1;
	}
	
	public void move_x_backward() {
		turn_x = 0
	}
	
	public void move_y_forward() {
		turn_y = 1
	}
	
	public void move_y_backward() {
		turn_y = 0
	}
}