package com.prowings.autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Computer {
	int compId;
	String modelName;
	@Autowired
	@Qualifier("cpu1")
	Central_processor cpu;

	public Computer() {
		super();

	}

	public Computer(int compId, String modelName) {
		super();
		this.compId = compId;
		this.modelName = modelName;
	}
   // @Autowired
	public Computer(Central_processor cpu) {
		super();
		this.cpu = cpu;
		System.out.println("AutoWired constructor get executed....");
	}

	public int getCompId() {
		return compId;
	}

	public void setCompId(int compId) {
		this.compId = compId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Central_processor getCpu() {
		return cpu;
	}
    //@Autowired
	public void setCpu(Central_processor cpu) {
		this.cpu = cpu;
		System.out.println("Autowired setter get executed...");
	}

	@Override
	public String toString() {
		return "Computer [compId=" + compId + ", modelName=" + modelName + ", cpu=" + cpu + "]";
	}

}