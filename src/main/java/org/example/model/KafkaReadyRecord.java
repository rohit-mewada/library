package org.example.model;


public class KafkaReadyRecord {

    private String recordNumber;

    private String payload;

    public String getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public KafkaReadyRecord(String recordNumber, String payload) {
        this.recordNumber = recordNumber;
        this.payload = payload;
    }

    public KafkaReadyRecord() {
    }
}
