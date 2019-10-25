package edu.asu.diging.rcn.kafka.messages.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class KafkaJobMessage implements Message {

    private String datasetId;
    private String jobId;
    
    @JsonCreator
    public KafkaJobMessage() {}
    
    public KafkaJobMessage(String datasetId, String jobId) {
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
}