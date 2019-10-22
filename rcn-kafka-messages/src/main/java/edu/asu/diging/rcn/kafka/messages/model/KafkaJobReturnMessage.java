package edu.asu.diging.rcn.kafka.messages.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class KafkaJobReturnMessage {

    private String datasetId;
    private String jobId;
    private JobStatus status;
    
    @JsonCreator
    public KafkaJobReturnMessage() {}
    
    public KafkaJobReturnMessage(String datasetId, String jobId) {
        this.datasetId = datasetId;
        this.jobId = jobId;
    }

    public String getDatasetId() {
        return datasetId;
    }

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public JobStatus getStatus() {
        return status;
    }

    public void setStatus(JobStatus status) {
        this.status = status;
    }
}