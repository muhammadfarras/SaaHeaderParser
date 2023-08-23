package com.vensys.mxiso2022.data;

public interface TagHeader {
    public static String senderReference = "SenderReference";
    public static String messageIdentifier = "MessageIdentifier";
    public static String format = "Format";
    public static String subFormat = "SubFormat";
    public static String sessionNr = "SessionNr";
    public static String seqNr = "SeqNr";

    public static String expiryDateTime  = "ExpiryDateTime";

    public static String snFInputTime = "SnFInputTime";

    public static String priority = "Priority";


    public interface Sender {
        public static String Root = "Sender";

        public static String fullName = "FullName";
    }

    public interface Receiver {
        public static String Root = "Receiver";

        public static String fullName = "FullName";
    }
}
