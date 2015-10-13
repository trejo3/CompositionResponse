
public class Person {
	
	private Education edu;
	private Job job;
	
	public Person()
	{
		this.edu = new Education();
		edu.getClassIndex();
		
		this.job=new Job();
        job.setSalary(1000L);
	}
	
	public long getSalary() {
        return job.getSalary();
    }

	public int getClassIndex()
	{
		return edu.getClassIndex();
	}
	
	public int getClassID()
	{
		return edu.getClassID();
	}
	public String getClassName()
	{
		return edu.getClassName();
	}
	
	@Override
	public void toString()
	{
		edu.toString();
		job.toString();
	}

}
