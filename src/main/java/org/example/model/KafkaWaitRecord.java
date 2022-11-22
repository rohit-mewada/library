package org.example.model;

public class KafkaWaitRecord {
    private String recordNumber;

    private Integer delayMs;

    private String payload;

    public String getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    public Integer getDelayMs() {
        return delayMs;
    }

    public void setDelayMs(Integer delayMs) {
        this.delayMs = delayMs;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public KafkaWaitRecord(String recordNumber, Integer delayMs, String payload) {
        this.recordNumber = recordNumber;
        this.delayMs = delayMs;
        this.payload = payload;
    }

    public KafkaWaitRecord() {
    }
}
