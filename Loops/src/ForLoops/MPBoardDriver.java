package ForLoops;

public class MPBoardDriver {

	public static void main(String[] args)
	{
		MPBoard st1 = new MPBoard ("bhanu",75);
		MPBoard st2 = new MPBoard ("jatin",80);
		MPBoard st3 = new MPBoard ("dhum" ,23);
		MPBoard st4 = new MPBoard ("ahay" ,65);
		MPBoard st5 = new MPBoard ("jay"  ,72);
		MPBoard st6 = new MPBoard ("sonu" ,89);
		MPBoard st7 = new MPBoard ("abhi" ,64);
		MPBoard st8 = new MPBoard ("akash",71);
		
		
		MPBoard students [] = new MPBoard [8];
		
		students[0] = st1;
		students[1] = st2;
		students[2] = st3;
		students[3] = st4;
		students[4] = st5;
		students[5] = st6;
		students[6] = st7;
		students[7] = st8;
		
		
		for (int i = 0; i < students.length;i++)
		{
			if (students[i].percentage > 75 )
			{
				System.out.println(students[i].name+" "+students[i].percentage+" cograts you will get 250000 from goverments");			}
		}

	}

}
