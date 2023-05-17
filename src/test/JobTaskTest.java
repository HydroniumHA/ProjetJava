package test;

import business.JobTask;
import model.JobTaskException;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JobTaskTest {
    private JobTask jobTask;

    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
        jobTask = new JobTask();
    }

    @org.junit.jupiter.api.Test
    public void getJobTaskInfos() {
        assertThrows(JobTaskException.class, () -> {
            jobTask.getJobTaskInfos(13,2003);
        });
        assertThrows(JobTaskException.class, () -> {
            jobTask.getJobTaskInfos(-8,2003);
        });
        assertThrows(JobTaskException.class, () -> {
            jobTask.getJobTaskInfos(10,1800);
        });
        assertThrows(JobTaskException.class, () -> {
            jobTask.getJobTaskInfos(10,-2003);
        });
    }

    @org.junit.jupiter.api.Test
    public void setJobTaskInfos() {
        assertThrows(JobTaskException.class, () -> {
            jobTask.setJobTaskInfos(null,30.2);
        });
        assertThrows(JobTaskException.class, () -> {
            jobTask.setJobTaskInfos("BU001",null);
        });
        assertThrows(JobTaskException.class, () -> {
            jobTask.setJobTaskInfos("BU001",-30.2);
        });
    }
}