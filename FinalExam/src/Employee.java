
public class Employee {
	private ProjectNameEnum ProjectName;
	private String ProSkill;
	
	
	
	public ProjectNameEnum getProjectName() {
		return ProjectName;
	}
	public void setProjectName(ProjectNameEnum projectName) {
		ProjectName = projectName;
	}
	public String getProSkill() {
		return ProSkill;
	}
	public void setProSkill(String proSkill) {
		ProSkill = proSkill;
	}
	public Employee(ProjectNameEnum projectName, String proSkill) {
		super();
		this.ProjectName = projectName;
		ProSkill = proSkill;
	}
	
	
}