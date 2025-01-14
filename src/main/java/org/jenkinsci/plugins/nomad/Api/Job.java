package org.jenkinsci.plugins.nomad.Api;

import java.util.Arrays;
import java.util.List;

public final class Job {

    private String ID;
    private String Name;
    private String Namespace;
    private String Region;
    private String Type;
    private Integer Priority;
    private String[] Datacenters;
    private List<Constraint> Constraints;
    private TaskGroup[] TaskGroups;

    public Job(
            String ID,
            String name,
            String namespace,
            String region,
            String type,
            Integer priority,
            String[] datacenters,
            List<Constraint> constraints,
            TaskGroup[] taskGroups) {
        this.ID = ID;
        Name = name;
        Namespace = namespace;
        Region = region;
        Type = type;
        Priority = priority;
        Datacenters = Arrays.copyOf(datacenters, datacenters.length);
        Constraints = constraints;
        TaskGroups = Arrays.copyOf(taskGroups, taskGroups.length);
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNamespace() {
        return Namespace;
    }

    public void setNamespace(String namespace) {
        Namespace = namespace;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Integer getPriority() {
        return Priority;
    }

    public void setPriority(Integer priority) {
        Priority = priority;
    }

    public String[] getDatacenters() {
        return Arrays.copyOf(Datacenters, Datacenters.length);
    }

    public void setDatacenters(String[] datacenters) {
        Datacenters = Arrays.copyOf(datacenters, datacenters.length);
    }

    public TaskGroup[] getTaskGroups() {
        return Arrays.copyOf(TaskGroups, TaskGroups.length);
    }

    public void setTaskGroups(TaskGroup[] taskGroups) {
        TaskGroups = Arrays.copyOf(taskGroups, taskGroups.length);
    }

    public List<Constraint> getConstraints() {
        return Constraints;
    }

    public void setConstraints(List<Constraint> constraints) {
        Constraints = constraints;
    }

}
