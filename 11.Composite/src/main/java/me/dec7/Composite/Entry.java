package me.dec7.Composite;

public abstract class Entry {
	
	// 이름을 얻는다
	public abstract String getName();
	
	// 크기를 얻는다
	public abstract int getSize();
	
	// 엔트리를 추가한다
	// 디렉토리에 디렉토리 엔트리 (파일 혹은 디렉토리)를 추가한다.
	public Entry add(Entry entey) throws FileTreatmentException {
		
		throw new FileTreatmentException();
	}
	
	// 일람을 표시한다
	public void printList() {
		printList("");
		
	}
	
	// prefix를 붙여서 종류를 표시한다
	protected abstract void printList(String prefix);
	
	// 문자열 표현
	public String toString() {
		
		return getName() + " (" + getSize() + ")";
		
	}
	
}
