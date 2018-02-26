package oguenguer;

import java.io.File;


public class speicherplatzBestimmen {


	private static int index;
	private static long lon;


	public static int MengeAllerDateien(String dire){

		index = 0;
		File f = new File(dire);
		if(!f.exists()){
			return 0;
		}else{
			File file[] = f.listFiles();
			for(File f2:file){
				if( !f2.isDirectory()){
					index++;
				}
				index = MengeAllerDateien(f2.getAbsolutePath()) + index;
			}

		}
		return index;
	}


	public static int sub(String dire){
		int forsub = 0;
		File f = new File(dire);
		if(!f.exists()){
			return 0;
		}else{
			File file[]= f.listFiles();
			for(File f2:file){
				if(f2.isDirectory()){
					forsub++;
					forsub = sub(f2.getAbsolutePath()) + forsub;
				}
			} return forsub;
		}
	}


	public static long SpeicherPlatz(String dire){
		lon = 0;
		File f = new File(dire);
		if(!f.exists()){
			return 0;
		}else{
			File file[] = f.listFiles();
			for(File f2:file){
				if(f2.isDirectory()){
					lon = f2.length();
				}else{
					lon = SpeicherPlatz(f2.getAbsolutePath()) + lon;
				}
			}return lon;
		}
	}
	public static void main(String []Args){
		System.out.println(MengeAllerDateien("C:\\Schule\\3AHIT\\SEW\\3AHIT\\src\\D02_SpeicherplatzBestimmen"));
		System.out.println(SpeicherPlatz("C:\\Schule\\3AHIT\\SEW\\3AHIT\\src\\D02_SpeicherplatzBestimmen"));
		System.out.println(sub("C:\\Schule\\3AHIT\\SEW\\3AHIT\\src\\D02_SpeicherplatzBestimmen"));
	}
}
