package strings;

public class Anagrams {

	public static void main(String[] args) {
//   Method 1 :
//		String a = "aab";
//		String b = "abc";
//		
//		boolean isAnagram = false;
//		
//		boolean visited[] = new boolean[b.length()];
//		
//		if(a.length() == b.length()) {
//		
//		for(int i=0;i<a.length();i++) {
//			char c = a.charAt(i);
//			isAnagram = false;
//			for(int j=0; j<b.length();j++) {
//				if(b.charAt(j)== c && !visited[j]) {
//					visited[j] = true;
//					isAnagram = true;
//					break;
//				}
//			}
//			if(!isAnagram) {
//				break;
//			}
//		}
//		if(isAnagram) {
//			System.out.println("Is anagram");
//		}else {
//			System.out.println("Not anagram");
//		}
//	}
//	}
//}
//   Method 2 :
//		String a = "afsdbds@#";
//		String b = "absdfds#@";
//		boolean isAnagram = true;;
//		
//		int al[] = new int[256];
//		int bl[] = new int[256];
//		
//		for (char c: a.toCharArray()) {
//			int index = (int) c;
//			al[index]++;
//		}
//		for (char c: b.toCharArray()) {
//			int index = (int) c;
//			bl[index]++;
//		}
//		for(int i=0; i<256; i++) {
//			if(al[i]!= bl[i]) {
//				isAnagram = false;
//				break;
//			}
//		}
//		if(isAnagram) {
//			System.out.println("Is anagram");
//		}else {
//			System.out.println("Not anagram");
//		}
//	}	
//	}
		
//   Method 3 :
		String a = "afsdbds@#";
		String b = "absdfds#@";
		boolean isAnagram = true;;
		
		int al[] = new int[256];
		
		for (char c: a.toCharArray()) {
			int index = (int) c;
			al[index]++;
		}
		for (char c: b.toCharArray()) {
			int index = (int) c;
			al[index]--;
		}
		for(int i=0; i<256; i++) {
			if(al[i]!= 0) {
				isAnagram = false;
				break;
			}
		}
		if(isAnagram) {
			System.out.println("Is anagram");
		}else {
			System.out.println("Not anagram");
		}
		}	
		}
		
		