package edu.asu.diging.rcn.kafka.messages.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class KafkaMatchAuthoritiesJobMessage implements Message {

    private String initiator;
    private String jobId;
    private String baseDataset;
    private String matchDataset;
    
    public String getInitiator() {
        return initiator;
    }
    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }
    public String getJobId() {
        return jobId;
    }
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
    public String getBaseDataset() {
        return baseDataset;
    }
    public void setBaseDataset(String baseDataset) {
        this.baseDataset = baseDataset;
    }
    public String getMatchDataset() {
        return matchDataset;
    }
    public void setMatchDataset(String matchDataset) {
        this.matchDataset = matchDataset;
    }
    
    
}
