package me.dec7.Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry {
	
	// 디렉토리 이름
	private String name;
	
	// 디렉토리 엔트리의 집합
	private List<Entry> directory = new ArrayList<Entry>();
	
	// 생성자
	public Directory(String name) {
		this.name = name;
	}
	
	// 이름을 얻는다
	@Override
	public String getName() {
		
		return name;
		
	}

	// 크기를 얻는다
	@Override
	public int getSize() {
		int size = 0;
		Iterator<Entry> ir = directory.iterator();
		
		while (ir.hasNext()) {
			Entry entry = ir.next();
			size += entry.getSize();
		}
		
		return size;

	}
	
	// 엔트리 추가
	public Entry add(Entry entry) {
		directory.add(entry);
		
		return this;
	}
	
	// 엔트리 종류
	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
		Iterator<Entry> ir = directory.iterator();
		
		while (ir.hasNext()) {
			Entry entry = ir.next();
			entry.printList(prefix + "/" + name);
		}

	}

}
