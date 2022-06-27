package com.prowings.autowireannotation;

public class Central_processor {
	String processor_name;
	int processor_ram; // 32
	int processor_rom; // 512

	public Central_processor() {
		super();

	}

	public Central_processor(String processor_name, int processor_ram, int processor_rom) {
		super();
		this.processor_name = processor_name;
		this.processor_ram = processor_ram;
		this.processor_rom = processor_rom;
	}

	public String getProcessor_name() {
		return processor_name;
	}

	public void setProcessor_name(String processor_name) {
		this.processor_name = processor_name;
	}

	public int getProcessor_ram() {
		return processor_ram;
	}

	public void setProcessor_ram(int processor_ram) {
		this.processor_ram = processor_ram;
	}

	public int getProcessor_rom() {
		return processor_rom;
	}

	public void setProcessor_rom(int processor_rom) {
		this.processor_rom = processor_rom;
	}

	@Override
	public String toString() {
		return "Central_processor [processor_name=" + processor_name + ", processor_ram=" + processor_ram
				+ ", processor_rom=" + processor_rom + "]";
	}

}
