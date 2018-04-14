import java.util.*;
public class testtt {
	public static void main(String[] args) {
		/*String s1="51";
		String s2="50";
		String s3="6";
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.compareTo(s1));
		*/
		String a[]= {"1","2","4","5"};
		String b[]= {"1","3","5","6","7"};
		List<String> al=new ArrayList<String>();
		List<String> bl=new ArrayList<String>();
		for(int i=0;i<a.length;i++){
			al.add(a[i]);
		}
		for(int i=0;i<b.length;i++)
			bl.add(b[i]);
		
		List<String> result=new ArrayList<String>();
		int k =0;
		for(int i=0;i<al.size();i++){
			while(k<bl.size()){
				int flag=al.get(i).compareTo(bl.get(k));
				if(flag==0){
					result.add(al.get(i));
					k++;
					break;
				}
				else if(al.get(i).length()>bl.get(k).length()){
					k++;
					continue;
				}else if(al.get(i).length()<bl.get(k).length()){
					break;
				}else{
					if(flag==1){
						k++;
						continue;
					}
					if(flag==-1){
						break;
					}
				}
			}
		}
		System.out.println(result);
		/*for(int i=0;i<a.length;i++) {
			
			while(k<b.length) {
				int flag=a[i].compareTo(b[k]);
				if(flag==0) {
					System.out.println(a[i]);
					k++;
					break;
				}
				else if(a[i].length()>b[k].length()) {
					k++;
					continue;
				}
				else if(a[i].length()<b[k].length()) {
					break;
				}
				else {
					if(flag==1) {
						k++;
						continue;
					}
					if(flag==-1)
						break;
				}
			}
		
		}*/
	}
}

