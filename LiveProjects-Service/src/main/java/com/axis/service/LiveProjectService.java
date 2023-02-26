package com.axis.service;

import java.util.List;
import com.axis.model.LiveProject;

public interface LiveProjectService {
	public LiveProject add(LiveProject liveProject);
	public List<LiveProject> getall();
	public LiveProject getByProj(String projId,LiveProject liveProject);
	public LiveProject update(String projId,LiveProject liveProject);
	public String delete(String projId);
	public LiveProject search(String projName);
}
