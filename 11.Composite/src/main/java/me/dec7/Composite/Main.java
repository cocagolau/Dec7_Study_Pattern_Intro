package me.dec7.Composite;

public class Main {
	
	public static void main(String[] args) {
		try {
			System.out.println("Making root entries...");
			
			// 최상위 root 디렉토리 생성
			Directory rootdir = new Directory("root");
			
			// bin, tmp, usr 디렉토리 생성
			Directory bindir = new Directory("bin");
			Directory tmpdir = new Directory("tmp");
			Directory usrdir = new Directory("usr");
			
			// bin, tmp, usr 디렉토리는 root 디렉토리 하위에 추가
			rootdir.add(bindir);
			rootdir.add(tmpdir);
			rootdir.add(usrdir);
			
			// bin 디렉토리에 2개 파일 추가
			bindir.add(new File("vi", 10000));
			bindir.add(new File("latex", 20000));
			
			// root 디렉토리 출력
			rootdir.printList();
			
			
			System.out.println("");
			System.out.println("Making user entries...");
			
			// kim, lee, park 디렉토리 생성
			Directory Kim = new Directory("Kim");
			Directory Lee = new Directory("Lee");
			Directory Park = new Directory("Park");
			
			// usr 디렉토리에 kim, lee, park 디렉토리 추가
			usrdir.add(Kim);
			usrdir.add(Lee);
			usrdir.add(Park);
			
			// kim 디렉토리에 2개 파일 추가
			Kim.add(new File("diary.html", 100));
			Kim.add(new File("Composite.java", 200));
			
			// lee 디렉토리에 1개 파일 추가
			Lee.add(new File("game.doc", 300));
			
			// park 디렉토리에 2개 파일 추가
			Park.add(new File("memo.txt", 400));
			Park.add(new File("junk.mail", 500));
			
			// root 디렉토리 출력
			rootdir.printList();
			
		} catch (FileTreatmentException e) {
			e.printStackTrace();
		}
	}
}
