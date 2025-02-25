package com.vensys.mxiso2022.data;

public class SAAHeader {
    private String senderReference;
    private String messageIdentifier;
    private String format;
    private String subFormat;

    private String sessionNr;

    private String seqNr;

    private String senderFullName;

    private String receiverFullName;

    private String snFInputTime;

    private String expiryDateTime;

    private String priority;

    private String headerSAAFull;

    private String messageUserReference;

    public String getMessageUserReference() {
        return messageUserReference;
    }

    public void setMessageUserReference(String messageUserReference) {
        this.messageUserReference = messageUserReference;
    }

    /**
     *
     * @param senderReference
     */
    protected void setSenderReference(String senderReference) {
        this.senderReference = senderReference;
    }

    /**
     *
     * @return
     */
    public String getSenderReference(){
        return this.senderReference;
    }

    /**
     *
     * @param messageIdentifier
     */
    protected void setMessageIdentifier(String messageIdentifier){
        this.messageIdentifier = messageIdentifier;
    }

    /**
     *
     * @return
     */
    public String getMessageIdentifier() {
        return messageIdentifier;
    }

    /**
     *
     * @param format
     */
    protected void setFormat(String format) {
        this.format = format;
    }

    /**
     *
     * @return
     */
    public String getFormat() {
        return format;
    }

    /**
     *
     * @param subFormat
     */
    protected void setSubFormat(String subFormat) {
        this.subFormat = subFormat;
    }

    /**
     *
     * @return SubFormat dari SAA Header
     */
    public String getSubFormat() {
        return subFormat;
    }

    /**
     *
     * @param seqNr
     */
    protected void setSeqNr(String seqNr) {
        this.seqNr = seqNr;
    }

    /**
     *
     * @return
     */
    public String getSeqNr() {
        return seqNr;
    }

    /**
     *
     * @param sessionNr
     */
    protected void setSessionNr(String sessionNr) {
        this.sessionNr = sessionNr;
    }

    /**
     *
     * @return
     */
    public String getSessionNr() {
        return sessionNr;
    }

    protected void setSenderFullName(String senderFullName) {
        this.senderFullName = senderFullName;
    }

    public String getSenderFullName() {
        return senderFullName;
    }

    protected void setReceiverFullName(String receiverFullName) {
        this.receiverFullName = receiverFullName;
    }

    public String getReceiverFullName() {
        return receiverFullName;
    }

    protected void setExpiryDateTime(String expiryDateTime) {
        this.expiryDateTime = expiryDateTime;
    }

    public String getExpiryDateTime() {
        return expiryDateTime;
    }

    protected void setSnFInputTime(String snFInputTime) {
        this.snFInputTime = snFInputTime;
    }

    public String getSnFInputTime() {
        return snFInputTime;
    }

    protected void setPriority(String priority) {
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }

    public void setHeaderSAAFull(String headerSAAFull) {
        this.headerSAAFull = headerSAAFull;
    }

    public String getHeaderSAAFull() {
        return headerSAAFull;
    }
}
