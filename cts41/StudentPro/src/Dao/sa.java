package Dao;

import Data.Student;

public interface sa {

	//public List<Student> getStudents() {
	// TODO Auto-generated method stub
	/*return jdbcTemplate.query("select * from student", new ResultSetExtractor<List<Student>>() 
	{
		public List<Student>extractData(ResultSet rs) throws SQLException,DataAccessException
		{
			List<Student> list=new ArrayList<Student>();
			while(rs.next())
			{
				Student e=new Student();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setAge(rs.getInt(3));
				list.add(e);
				
			}
			return list;
		}
	});
	
	}*/
	boolean saveStudentByPst(Student e);

}