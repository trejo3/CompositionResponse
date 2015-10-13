
public class Education {
	
	private int classIndex;
	private int classID;
	private String className;
	
	
	public int getClassIndex() {
		return classIndex;
	}
	public void setClassIndex(int classIndex) {
		this.classIndex = classIndex;
	}
	public int getClassID() {
		return classID;
	}
	public void setClassID(int classID) {
		this.classID = classID;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	@Override
	public void toString()
	{
		System.out.println(Integer.toString(classIndex));
		System.out.println(Integer.toString(classID));
		System.out.println(className);
	}
	
}
