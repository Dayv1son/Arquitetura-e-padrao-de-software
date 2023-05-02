package model_bridge;

public abstract class CreateRobot {
	
	private Robot robot;
	
	public Robot getRobot() {
		return robot;
	}

	public void setRobot(Robot robot) {
		this.robot = robot;
	}
	
	public void membroSuperior() {
		robot.criarBraco();
	}

	public void membroInferior() {
		robot.criarPerna();
	}
	
	public void corpo() {
		robot.corpo();
	}
	
	public void cabeca() {
		robot.cabeca();
	}
}
