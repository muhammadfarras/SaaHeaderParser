package com.vensys.mxiso2022.data;

public interface TagHeader {
    public static String senderReference = "Saa:SenderReference";
    public static String messageIdentifier = "Saa:MessageIdentifier";
    public static String format = "Saa:Format";
    public static String subFormat = "Saa:SubFormat";
    public static String sessionNr = "Saa:SessionNr";
    public static String seqNr = "Saa:SeqNr";

    public static String expiryDateTime  = "Saa:ExpiryDateTime";

    public static String snFInputTime = "Saa:SnFInputTime";

    public static String priority = "Saa:Priority";


    public interface Sender {
        public static String Root = "Saa:Sender";

        public static String fullName = "Saa:FullName";
    }

    public interface Receiver {
        public static String Root = "Saa:Receiver";

        public static String fullName = "Saa:FullName";
    }
}
