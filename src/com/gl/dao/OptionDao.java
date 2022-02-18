package com.gl.dao;

import java.util.List;

import com.gl.beans.Option;

public interface OptionDao {
	public Option addOption(Option option) throws Exception;
	public Option updateOption(Option option) throws Exception;
	public Option deleteOption(Option option) throws Exception;
	public Option getOption(String name) throws Exception;
	public List<Option> getOptions() throws Exception;
}
